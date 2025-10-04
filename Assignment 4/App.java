public class App {
    public static void main(String[] args) throws Exception {

        //creating initial array
        int[]myArray = {10,3,295,38,20,3,4,267,2445,10,5566,87,93,17,10,2,87,267,3176,3,82};
    
        //creating blank arrays of the same length to use later in the program, finding and counting duplicates
        int[]dupes = new int[myArray.length]; //stores the duplicates
        int[]counts = new int[myArray.length]; //stores how many times each duplicate appears
        int dupeTrack = 0; //tracks duplicates found


        //this loop is going through the array one by one
        //looking at the current number and comparing it to see how many times it appear
        for (int i = 0; i < myArray.length; i ++){
            int now = myArray[i];
            int track = 0;
        
        
        boolean accounted = false; //setting up assumption there are no duplicates
        //this loop uses the variable made in last loop to store them
        for (int j = 0; j < dupeTrack; j ++){
            if (dupes[j] == now){
                accounted = true; //making sure that each duplicate is only counted one
                break;
            }
        }

        //if the duplicate was already found, program contiunes
        if (accounted){
            continue;
        }

        //going through array again, counting how many times each duplicate appears
        for (int l = 0; l < myArray.length; l++){
            if (myArray[l] == now){
                track++;
            }
        }

        
        if (track > 1){
            dupes[dupeTrack] = now; //stores the duplicates in array
            counts[dupeTrack] = track; //stores how many times duplicate appears in array
            dupeTrack++;
        }
        }


        //using if and else to create print statements to tell the user if and how many duplicates there are in the array
        if (dupeTrack == 0) {
            System.out.println("No duplicates found.");
        } else {
            System.out.println("Duplicate numbers and their counts:");
            //if there are duplicates, for loop is triggered to print to the user each duplicate along with how many times it was seen
            for (int a = 0; a < dupeTrack; a++) {
                System.out.println(dupes[a] + " appears " + counts[a] + " times.");
            }
        }
        }
    
    }

    //This assingment was MUCH harder for me than the past ones have been, but the challenge was fun
    //I knew in order to check for duplicates I would need to use a boolean, but it definitily took some serious googling to get this to work
    //Also - I feel like I am getting more comfotable with if and if else, using them here simillarly to how I have using them in python, inculding contiune and break
    //I think that this assingment also reminded me of the importance of variable names, I was getting very confused myself with the ones that I choose, may want to re-think some of these...
