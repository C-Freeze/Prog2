//Demo1.java
//Carter Freeze
//1/10/22
//Review from first day of class

import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);// Create a scanner
        Random rand = new Random(); // Create a random number generator

        System.out.print("Enter output file name: ");
        String fileName = input.nextLine();
        
        File file = new File(fileName); // Create a txt file
        FileWriter fw = new FileWriter(file); // Create a file writer
        
        int guess; // Create a variable to hold the guess
        // Storage for the min and max values, values will be between 1 and 100
        int min = 100;
        int max = 1;

        System.out.print("How many numbers should be generated: "); // Prompt user number of times to generate random
                                                                    // numbers
        

        int num = input.nextInt(); // Get user input
        input.nextLine(); // Clear scanner of new line, just in case

        for (int i = 0; i < num; i++) { // Loop through the number of times the user wants to generate random numbers

            guess = rand.nextInt(100) + 1; // Generate a random number between 1 and 100
            System.out.printf("Guess %d is %d\n", (i + 1), guess);
            ; // Print the random number

            if (guess < min) { // If the random number is less than the min value
                min = guess; // we have a new min value
            }

            if (guess > max) { // If the random number is greater than the max value
                max = guess; // we have a new max value
            }
        }

        System.out.println("The minimum value is: " + min); // Print the min value
        System.out.println("The maximum value is: " + max); // Print the max value

        // close scanner resource
        fw.close();
        input.close();
    }
}
