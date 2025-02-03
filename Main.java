//Main.java
//Name : Utkarsh Lakhani
//PRN : 23070126064
//Batch : 2023-2027

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        ArrayInput Ai = new ArrayInput(scan); // Create ArrayInput object
        ArrayFunctions Af = new ArrayFunctions(); // Create ArrayFunctions object

        int[] userArray = Ai.userInput(); // Get array input from user

        Af.oddEven(userArray); // Perform odd/even separation
        Af.minDif(userArray); // Find minimum consecutive difference
        Af.displayConversions(userArray); // Demonstrate array conversions
    }
}
