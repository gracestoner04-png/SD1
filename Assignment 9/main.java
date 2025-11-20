import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stax = new Stack<>();
        
        stax.push(70);
        stax.push(34);
        stax.push(807);
        stax.push(61);
        stax.push(28);
        stax.push(563);
        stax.push(492);
        stax.push(386);


        //starts to track the elements of the stack, begining at index 0 for comparison 
        int maxVal = stax.get(0); 
        int minVal = stax.get(0);

        //creating a for loop that compares each value with the one before
        //pulling ints from stax
        //first loop looking for max - checking if current element is greater than the previous one checked
        //second for min - checking if current element is less than previous
        //if condition is statified - value becomes the new current element and the loop runs again for the next element until we reach the end
        for (int currentElement : stax) {
            if (currentElement > maxVal) {
                maxVal = currentElement;
            }
            if (currentElement < minVal) {
                minVal = currentElement;
            }
        }

        //prining out the results from the for loops
        System.out.println("Maximum value: " + maxVal);
        System.out.println("Minimum value: " + minVal);



        //printing out the size of the stack using .size()
        System.out.println(stax.size());
        
        
        LinkedList<Integer> linky = new LinkedList<>();

        linky.add(10);
        linky.add(20);
        linky.add(30);
        linky.add(40);
        linky.add(50);

        //Alternating removing the last and first elements of the linkedlist to get to the middle value
        linky.removeLast();
        linky.removeFirst();
        linky.removeLast();
        linky.removeFirst();
        System.out.println("The middle value is " + linky);


        Queue<String> queCall = new LinkedList<>();
        //adding callers to the que
        queCall.add("Caller 1");
        queCall.add("Caller 2");
        queCall.add("Caller 3");
        queCall.add("Caller 4");
        queCall.add("Caller 5");
        queCall.add("Caller 6");
        //removing the first two that were added 
        queCall.remove();
        queCall.remove();
        System.out.println("After the first two calls were answered at the call center, " + queCall.element() + " will have their call answered next");
        //adding two more to the end of the que
        queCall.add("Caller 7");
        queCall.add("Caller 8");
        //determining how many there are currently in the que, adding and subratracting since the orginial list
        System.out.println("There are currently " + queCall.size() + " people in line waiting for their call to be answered.");
        queCall.remove();
        System.out.println("Hello " + queCall.element() + " how can we help you?");
    }
}
