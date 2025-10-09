import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // creating an array list that can store all the values of the cases 
        List<Double> caseValues = new ArrayList<Double>();
        Collections.addAll(caseValues,
            0.01, 1.0, 5.0, 10.0, 25.0, 50.0, 75.0, 100.0,
            200.0, 300.0, 400.0, 500.0, 750.0, 1000.0, 5000.0,
            10000.0, 25000.0, 50000.0, 75000.0, 100000.0,
            200000.0, 300000.0, 400000.0, 500000.0, 750000.0, 1000000.0
        );

        // shuffling the cases so the values are not in order
        Collections.shuffle(caseValues);

        //importing scanner to be used throughout the game
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello and welcome to a game of Deal or No Deal!");
        System.out.println("Pick a case number (0–25) to set aside.");
        //playerCase to be compared to throguhout the game, ensuring that the user does not choose this case again
        int playerCase = sc.nextInt();

        double playerCaseValue = caseValues.get(playerCase);
        System.out.println("You chose case #" + playerCase + " to set aside.");
        System.out.println("Let's begin the first round!");

        System.out.println("Round 1");
        // player opens 6 cases in the first round
        //loop to have the user pick cases
        //also checking to make sure the seclected case is not the one already set aside or cases that have already been chosen
        for (int i = 1; i <= 6; i++) {
            System.out.println("Pick a case number to reveal (0–25), just not " + playerCase + ": ");
            int selectedCaseIndex = sc.nextInt();

            //prompts user to select a new case if they repeat a number
            if (selectedCaseIndex == playerCase) {
                System.out.println("You can’t pick your own case! Try again.");
                i--; // repeat this round
                continue;
            }

            double chosenValue = caseValues.get(selectedCaseIndex);
            System.out.println("Case #" + selectedCaseIndex + " contained $" + chosenValue);
            caseValues.set(selectedCaseIndex, -1.0); // mark case as opened
        }
    

        double total = 0.0;
        int remaining = 0;

        // looping through all the cases that have not been chosen
        for (int k = 0; k < caseValues.size(); k++) {
            if (caseValues.get(k) != -1.0 && k != playerCase) {
                total += caseValues.get(k);
                remaining++;
            }
        }

        //taking average of cases left in order to get the value that the banker will offer
        double average1 = total / remaining;
        double BankOffer1 = Math.round(average1); // rounding the average to the nearest whole number

        System.out.println("The banker is ready to make an offer...");
        System.out.println("His offer is $" + BankOffer1);
        System.out.println("Would you like to make a deal? Please enter 'Deal' or 'No Deal'");
        String answer1 = sc.next();

        if (answer1.equalsIgnoreCase("deal")) { // ignore capitalization
            System.out.println("You have decided to take the Banker's offer for $" + BankOffer1 + ".");
            System.out.println("Let's see if that was a good decision...");
            System.out.println("Your case contained $" + playerCaseValue + ".");
    
        //depeneding on how the case selected compared to the banker's offer, printing different statements
        if (playerCaseValue > BankOffer1) {
            System.out.println("Oh no! You made a bad deal - your case had more money!");
    }   else if (playerCaseValue < BankOffer1) {
            System.out.println("Nice job! You made a good deal and beat the Banker!");
    }   else {
            System.out.println("Wow! It’s a perfect tie — your case was worth exactly the offer!");
    }

    //once the player selects deal once, the game is over
    System.out.println("Game Over!");
    return; 

        } else {
            System.out.println("You chose to keep playing... risky move I like it!");
            System.out.println("We’ll continue with another round!");
        }


        //resetting and repeating all above steps from round 2-9 or until the user choses deal
        sc.nextLine();

        System.out.println("Round 2");
        // player opens 5 cases for the second round
        for (int i = 1; i <= 5; i++) {
            System.out.println("Pick a case number to reveal (0–25), just not " + playerCase + ": ");
            int selectedCaseIndex = sc.nextInt();

            if (selectedCaseIndex == playerCase) {
                System.out.println("You can’t pick your own case! Try again.");
                i--; 
                continue;
            }

        if (selectedCaseIndex < 0 || selectedCaseIndex >= caseValues.size()) {
            System.out.println("That’s not a valid case number! Try again.");
            i--;
            continue;
        }

        if (caseValues.get(selectedCaseIndex) == -1.0) {
            System.out.println("That case has already been opened! Pick a different one.");
            i--; 
            continue;
        }

            double chosenValue = caseValues.get(selectedCaseIndex);
            System.out.println("Case #" + selectedCaseIndex + " contained $" + chosenValue);
            caseValues.set(selectedCaseIndex, -1.0); 
        }

        // calculating new banker's offer (after Round 2)
        total = 0.0;
        remaining = 0;
        for (int k = 0; k < caseValues.size(); k++) {
            if (caseValues.get(k) != -1.0 && k != playerCase) {
                total += caseValues.get(k);
                remaining++;
            }
        }

        double average2 = total / remaining;
        double BankOffer2 = Math.round(average2); 

        System.out.println("The banker is ready to make an offer...");
        System.out.println("His offer is $" + BankOffer2);
        System.out.println("Would you like to make a deal? Please enter 'Deal' or 'No Deal'");
        String answer2 = sc.next();


        if (answer2.equalsIgnoreCase("deal")) { 
            System.out.println("You have decided to take the Banker's offer for $" + BankOffer2 + ".");
            System.out.println("Let's see if that was a good decision...");
            System.out.println("Your case contained $" + playerCaseValue + ".");
    
        if (playerCaseValue > BankOffer2) {
            System.out.println("Oh no! You made a bad deal - your case had more money!");
    }   else if (playerCaseValue < BankOffer2) {
            System.out.println("Nice job! You made a good deal and beat the Banker!");
    }   else {
            System.out.println("Wow! It’s a perfect tie — your case was worth exactly the offer!");
    }

    System.out.println("Game Over!");
    return; 

        } else {
            System.out.println("You chose to keep playing... risky move I like it!");
            System.out.println("We’ll continue with another round!");
        }

        sc.nextLine();

        System.out.println("Round 3");
        // player opens 4 cases for the third round
        for (int i = 1; i <= 4; i++) {
            System.out.println("Pick a case number to reveal (0–25), just not " + playerCase + ": ");
            int selectedCaseIndex = sc.nextInt();

            if (selectedCaseIndex == playerCase) {
                System.out.println("You can’t pick your own case! Try again.");
                i--; 
                continue;
            }

            if (selectedCaseIndex < 0 || selectedCaseIndex >= caseValues.size()) {
                System.out.println("That’s not a valid case number! Try again.");
                i--;
                continue;
            }

            if (caseValues.get(selectedCaseIndex) == -1.0) {
                System.out.println("That case has already been opened! Pick a different one.");
                i--; 
                continue;
        }

            double chosenValue = caseValues.get(selectedCaseIndex);
            System.out.println("Case #" + selectedCaseIndex + " contained $" + chosenValue);
            caseValues.set(selectedCaseIndex, -1.0); 
        }

        // calculating new banker's offer (after Round 3)
        total = 0.0;
        remaining = 0;
        for (int k = 0; k < caseValues.size(); k++) {
            if (caseValues.get(k) != -1.0 && k != playerCase) {
                total += caseValues.get(k);
                remaining++;
            }
        }

        double average3 = total / remaining;
        double BankOffer3 = Math.round(average3); 

        System.out.println("The banker is ready to make an offer...");
        System.out.println("His offer is $" + BankOffer3);
        System.out.println("Would you like to make a deal? Please enter 'Deal' or 'No Deal'");
        String answer3 = sc.next();

        if (answer3.equalsIgnoreCase("deal")) { 
            System.out.println("You have decided to take the Banker's offer for $" + BankOffer3 + ".");
            System.out.println("Let's see if that was a good decision...");
            System.out.println("Your case contained $" + playerCaseValue + ".");
    
        if (playerCaseValue > BankOffer3) {
            System.out.println("Oh no! You made a bad deal - your case had more money!");
    }   else if (playerCaseValue < BankOffer3) {
            System.out.println("Nice job! You made a good deal and beat the Banker!");
    }   else {
            System.out.println("Wow! It’s a perfect tie — your case was worth exactly the offer!");
    }

    System.out.println("Game Over!");
    return; 

        } else {
            System.out.println("You chose to keep playing... risky move I like it!");
            System.out.println("We’ll continue with another round!");
        }



        sc.nextLine();

        System.out.println("Round 4");
        // player opens 3 cases for the fourth round
        for (int i = 1; i <= 3; i++) {
            System.out.println("Pick a case number to reveal (0–25), just not " + playerCase + ": ");
            int selectedCaseIndex = sc.nextInt();

            if (selectedCaseIndex == playerCase) {
                System.out.println("You can’t pick your own case! Try again.");
                i--; 
                continue;
            }

            if (selectedCaseIndex < 0 || selectedCaseIndex >= caseValues.size()) {
                System.out.println("That’s not a valid case number! Try again.");
                i--;
                continue;
            }

            if (caseValues.get(selectedCaseIndex) == -1.0) {
                System.out.println("That case has already been opened! Pick a different one.");
                i--; 
                continue;
          }

            double chosenValue = caseValues.get(selectedCaseIndex);
            System.out.println("Case #" + selectedCaseIndex + " contained $" + chosenValue);
            caseValues.set(selectedCaseIndex, -1.0); 
        }

        // calculating new banker's offer (after Round 4)
        total = 0.0;
        remaining = 0;
        for (int k = 0; k < caseValues.size(); k++) {
            if (caseValues.get(k) != -1.0 && k != playerCase) {
                total += caseValues.get(k);
                remaining++;
            }
        }

        double average4 = total / remaining;
        double BankOffer4 = Math.round(average4); 

        System.out.println("The banker is ready to make an offer...");
        System.out.println("His offer is $" + BankOffer4);
        System.out.println("Would you like to make a deal? Please enter 'Deal' or 'No Deal'");
        String answer4 = sc.next();

        if (answer4.equalsIgnoreCase("deal")) { 
            System.out.println("You have decided to take the Banker's offer for $" + BankOffer4 + ".");
            System.out.println("Let's see if that was a good decision...");
            System.out.println("Your case contained $" + playerCaseValue + ".");
    
        if (playerCaseValue > BankOffer4) {
            System.out.println("Oh no! You made a bad deal - your case had more money!");
    }   else if (playerCaseValue < BankOffer4) {
            System.out.println("Nice job! You made a good deal and beat the Banker!");
    }   else {
            System.out.println("Wow! It’s a perfect tie — your case was worth exactly the offer!");
    }

    System.out.println("Game Over!");
    return; 

        } else {
            System.out.println("You chose to keep playing... risky move I like it!");
            System.out.println("We’ll continue with another round!");
        }



        sc.nextLine();

        System.out.println("Round 5");
        // player opens 2 cases for the fifth round
        for (int i = 1; i <= 2; i++) {
            System.out.println("Pick a case number to reveal (0–25), just not " + playerCase + ": ");
            int selectedCaseIndex = sc.nextInt();

            if (selectedCaseIndex == playerCase) {
                System.out.println("You can’t pick your own case! Try again.");
                i--; 
                continue;
            }

                if (selectedCaseIndex < 0 || selectedCaseIndex >= caseValues.size()) {
                    System.out.println("That’s not a valid case number! Try again.");
                    i--;
                    continue;
            }

            if (caseValues.get(selectedCaseIndex) == -1.0) {
                System.out.println("That case has already been opened! Pick a different one.");
                i--; 
                continue;
          }

            double chosenValue = caseValues.get(selectedCaseIndex);
            System.out.println("Case #" + selectedCaseIndex + " contained $" + chosenValue);
            caseValues.set(selectedCaseIndex, -1.0); 
        }

        // calculating new banker's offer (after Round 5)
        total = 0.0;
        remaining = 0;
        for (int k = 0; k < caseValues.size(); k++) {
            if (caseValues.get(k) != -1.0 && k != playerCase) {
                total += caseValues.get(k);
                remaining++;
            }
        }

        double average5 = total / remaining;
        double BankOffer5 = Math.round(average5); 

        System.out.println("The banker is ready to make an offer...");
        System.out.println("His offer is $" + BankOffer5);
        System.out.println("Would you like to make a deal? Please enter 'Deal' or 'No Deal'");
        String answer5 = sc.next();

        if (answer5.equalsIgnoreCase("deal")) { 
            System.out.println("You have decided to take the Banker's offer for $" + BankOffer5 + ".");
            System.out.println("Let's see if that was a good decision...");
            System.out.println("Your case contained $" + playerCaseValue + ".");
    
        if (playerCaseValue > BankOffer5) {
            System.out.println("Oh no! You made a bad deal - your case had more money!");
    }   else if (playerCaseValue < BankOffer5) {
            System.out.println("Nice job! You made a good deal and beat the Banker!");
    }   else {
            System.out.println("Wow! It’s a perfect tie — your case was worth exactly the offer!");
    }

    System.out.println("Game Over!");
    return; 

        } else {
            System.out.println("You chose to keep playing... risky move I like it!");
            System.out.println("We’ll continue with another round!");
        }


            sc.nextLine();

        System.out.println("Round 6");
        // player opens 1 case for the sixth round
        for (int i = 1; i <= 1; i++) {
            System.out.println("Pick a case number to reveal (0–25), just not " + playerCase + ": ");
            int selectedCaseIndex = sc.nextInt();

            if (selectedCaseIndex == playerCase) {
                System.out.println("You can’t pick your own case! Try again.");
                i--; 
                continue;
            }

                if (selectedCaseIndex < 0 || selectedCaseIndex >= caseValues.size()) {
                    System.out.println("That’s not a valid case number! Try again.");
                    i--;
                    continue;
            }

            if (caseValues.get(selectedCaseIndex) == -1.0) {
                System.out.println("That case has already been opened! Pick a different one.");
                i--; 
                continue;
          }

            double chosenValue = caseValues.get(selectedCaseIndex);
            System.out.println("Case #" + selectedCaseIndex + " contained $" + chosenValue);
            caseValues.set(selectedCaseIndex, -1.0); 
        }

        // calculating new banker's offer (after Round 6)
        total = 0.0;
        remaining = 0;
        for (int k = 0; k < caseValues.size(); k++) {
            if (caseValues.get(k) != -1.0 && k != playerCase) {
                total += caseValues.get(k);
                remaining++;
            }
        }

        double average6 = total / remaining;
        double BankOffer6 = Math.round(average6); 

        System.out.println("The banker is ready to make an offer...");
        System.out.println("His offer is $" + BankOffer6);
        System.out.println("Would you like to make a deal? Please enter 'Deal' or 'No Deal'");
        String answer6 = sc.next();

        if (answer6.equalsIgnoreCase("deal")) { 
            System.out.println("You have decided to take the Banker's offer for $" + BankOffer6 + ".");
            System.out.println("Let's see if that was a good decision...");
            System.out.println("Your case contained $" + playerCaseValue + ".");
    
        if (playerCaseValue > BankOffer6) {
            System.out.println("Oh no! You made a bad deal - your case had more money!");
    }   else if (playerCaseValue < BankOffer6) {
            System.out.println("Nice job! You made a good deal and beat the Banker!");
    }   else {
            System.out.println("Wow! It’s a perfect tie — your case was worth exactly the offer!");
    }

    System.out.println("Game Over!");
    return; 

        } else {
            System.out.println("You chose to keep playing... risky move I like it!");
            System.out.println("We’ll continue with another round!");
        }


        sc.nextLine();

        System.out.println("Round 7");
        // player opens 1 case for the seventh round
        for (int i = 1; i <= 1; i++) {
            System.out.println("Pick a case number to reveal (0–25), just not " + playerCase + ": ");
            int selectedCaseIndex = sc.nextInt();

            if (selectedCaseIndex == playerCase) {
                System.out.println("You can’t pick your own case! Try again.");
                i--; 
                continue;
            }

                if (selectedCaseIndex < 0 || selectedCaseIndex >= caseValues.size()) {
                    System.out.println("That’s not a valid case number! Try again.");
                    i--;
                    continue;
            }

            if (caseValues.get(selectedCaseIndex) == -1.0) {
                System.out.println("That case has already been opened! Pick a different one.");
                i--; 
                continue;
          }

            double chosenValue = caseValues.get(selectedCaseIndex);
            System.out.println("Case #" + selectedCaseIndex + " contained $" + chosenValue);
            caseValues.set(selectedCaseIndex, -1.0); 
        }

        // calculating new banker's offer (after Round 7)
        total = 0.0;
        remaining = 0;
        for (int k = 0; k < caseValues.size(); k++) {
            if (caseValues.get(k) != -1.0 && k != playerCase) {
                total += caseValues.get(k);
                remaining++;
            }
        }

        double average7 = total / remaining;
        double BankOffer7 = Math.round(average7); 

        System.out.println("The banker is ready to make an offer...");
        System.out.println("His offer is $" + BankOffer7);
        System.out.println("Would you like to make a deal? Please enter 'Deal' or 'No Deal'");
        String answer7 = sc.next();

        if (answer7.equalsIgnoreCase("deal")) { 
            System.out.println("You have decided to take the Banker's offer for $" + BankOffer7 + ".");
            System.out.println("Let's see if that was a good decision...");
            System.out.println("Your case contained $" + playerCaseValue + ".");
    
        if (playerCaseValue > BankOffer7) {
            System.out.println("Oh no! You made a bad deal - your case had more money!");
    }   else if (playerCaseValue < BankOffer7) {
            System.out.println("Nice job! You made a good deal and beat the Banker!");
    }   else {
            System.out.println("Wow! It’s a perfect tie — your case was worth exactly the offer!");
    }

    System.out.println("Game Over!");
    return; 

        } else {
            System.out.println("You chose to keep playing... risky move I like it!");
            System.out.println("We’ll continue with another round!");
        }


        sc.nextLine();

        System.out.println("Round 8");
        // player opens 1 case for the eigth round
        for (int i = 1; i <= 1; i++) {
            System.out.println("Pick a case number to reveal (0–25), just not " + playerCase + ": ");
            int selectedCaseIndex = sc.nextInt();

            if (selectedCaseIndex == playerCase) {
                System.out.println("You can’t pick your own case! Try again.");
                i--; 
                continue;
            }

                if (selectedCaseIndex < 0 || selectedCaseIndex >= caseValues.size()) {
                    System.out.println("That’s not a valid case number! Try again.");
                    i--;
                    continue;
            }

            if (caseValues.get(selectedCaseIndex) == -1.0) {
                System.out.println("That case has already been opened! Pick a different one.");
                i--; 
                continue;
          }

            double chosenValue = caseValues.get(selectedCaseIndex);
            System.out.println("Case #" + selectedCaseIndex + " contained $" + chosenValue);
            caseValues.set(selectedCaseIndex, -1.0); 
        }

        // calculating new banker's offer (after Round 7)
        total = 0.0;
        remaining = 0;
        for (int k = 0; k < caseValues.size(); k++) {
            if (caseValues.get(k) != -1.0 && k != playerCase) {
                total += caseValues.get(k);
                remaining++;
            }
        }

        double average8 = total / remaining;
        double BankOffer8 = Math.round(average8); 

        System.out.println("The banker is ready to make an offer...");
        System.out.println("His offer is $" + BankOffer8);
        System.out.println("Would you like to make a deal? Please enter 'Deal' or 'No Deal'");
        String answer8 = sc.next();

        if (answer8.equalsIgnoreCase("deal")) { 
            System.out.println("You have decided to take the Banker's offer for $" + BankOffer8 + ".");
            System.out.println("Let's see if that was a good decision...");
            System.out.println("Your case contained $" + playerCaseValue + ".");
    
        if (playerCaseValue > BankOffer8) {
            System.out.println("Oh no! You made a bad deal - your case had more money!");
    }   else if (playerCaseValue < BankOffer8) {
            System.out.println("Nice job! You made a good deal and beat the Banker!");
    }   else {
            System.out.println("Wow! It’s a perfect tie — your case was worth exactly the offer!");
    }

    System.out.println("Game Over!");
    return; 

        } else {
            System.out.println("You chose to keep playing... risky move I like it!");
            System.out.println("We’ll continue with another round!");
        }


        sc.nextLine();

        System.out.println("Final Round!");
        // player opens 1 case for the last round
        for (int i = 1; i <= 1; i++) {
            System.out.println("Pick a case number to reveal (0–25), just not " + playerCase + ": ");
            int selectedCaseIndex = sc.nextInt();

            if (selectedCaseIndex == playerCase) {
                System.out.println("You can’t pick your own case! Try again.");
                i--; 
                continue;
            }

                if (selectedCaseIndex < 0 || selectedCaseIndex >= caseValues.size()) {
                    System.out.println("That’s not a valid case number! Try again.");
                    i--;
                    continue;
            }

            if (caseValues.get(selectedCaseIndex) == -1.0) {
                System.out.println("That case has already been opened! Pick a different one.");
                i--; 
                continue;
          }

            double chosenValue = caseValues.get(selectedCaseIndex);
            System.out.println("Case #" + selectedCaseIndex + " contained $" + chosenValue);
            caseValues.set(selectedCaseIndex, -1.0); 
        }

        // calculating new banker's offer (after Round 9)
        total = 0.0;
        remaining = 0;
        for (int k = 0; k < caseValues.size(); k++) {
            if (caseValues.get(k) != -1.0 && k != playerCase) {
                total += caseValues.get(k);
                remaining++;
            }
        }

        double average9 = total / remaining;
        double BankOffer9 = Math.round(average9); 

        System.out.println("The banker is ready to make an offer...");
        System.out.println("His offer is $" + BankOffer9);
        System.out.println("Would you like to make a deal? Please enter 'Deal' or 'No Deal'");
        String answer9 = sc.next();

        if (answer9.equalsIgnoreCase("deal")) { 
            System.out.println("You have decided to take the Banker's offer for $" + BankOffer9 + ".");
            System.out.println("Let's see if that was a good decision...");
            System.out.println("Your case contained $" + playerCaseValue + ".");
    
        if (playerCaseValue > BankOffer9) {
            System.out.println("Oh no! You made a bad deal - your case had more money!");
    }   else if (playerCaseValue < BankOffer9) {
            System.out.println("Nice job! You made a good deal and beat the Banker!");
    }   else {
            System.out.println("Wow! It’s a perfect tie — your case was worth exactly the offer!");
    }

    System.out.println("Game Over!");
    return; 

        } else {
            System.out.println("Welp this is the end!");
        }

    } 
} 
