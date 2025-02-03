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
            if (num % 2 == 0) even.add(num); // Add even numbers
            else odd.add(num); // Add odd numbers
        }
    }
}
