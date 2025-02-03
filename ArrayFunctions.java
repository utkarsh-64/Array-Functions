// ArrayFunctions.java
import java.util.*;

class ArrayFunctions {
    // Display an ArrayList of integers
    void display(ArrayList<Integer> array) {
        System.out.println("ArrayList: " + array);
    }

    // Display an integer array
    void display(int[] array) {
        System.out.println("Array: " + Arrays.toString(array));
    }

    // Separate and display odd and even numbers from an array
    void oddEven(int[] array) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int num : array) {
            if (num % 2 == 0){
                even.add(num); // Add even numbers
            }    
            else{
                odd.add(num); // Add odd numbers
            }    
        }

        System.out.println("\n--- Odd/Even Separation ---");
        display(even); // Display even numbers
        display(odd); // Display odd numbers
    }

    // Find and display the minimum difference between consecutive elements
    void minDif(int[] array) {
        int minDifference = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < array.length - 1; i++) {
            int currentDiff = Math.abs(array[i] - array[i + 1]); // Calculate difference
            if (currentDiff < minDifference) {
                minDifference = currentDiff; // Update minimum difference
                index = i; // Update index
            }
        }
        //Display the output for the minDist
        System.out.println("\n--- Minimum Consecutive Difference ---");
        System.out.println("Minimum difference: " + minDifference + " at index: " + index);
    }        
}
