//Demo3.java
//Carter Freeze
//1/10/22
//Review from first day of class

import java.io.*;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        // Create a scanner and get input file name
        Scanner input = new Scanner(System.in);
        System.out.print("Enter input file name: ");
        String fileName = input.nextLine();

        //Attempt to open the file
        File file = new File(fileName);

        // Create a file object
        if (!file.exists()) { // Basic error checking
            System.out.println("File does not exist");
            // Close resources
            input.close();
            System.exit(0);
        }

        Scanner fileScanner = new Scanner(file); // File input

        int min = 100; // Initialize min and max values
        int max = 1;
        int count = 0; // Initialize count to 0

        while(fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            
            int guess = Integer.parseInt(line); // Parse the line to an integer
            //find min and max
            if (guess < min) {
                min = guess;
            }
            
            if (guess > max) {
                max = guess;
            }
            
            count++; // Increment count
        }

        // Print the min and max values
        System.out.println("The minimum value is: " + min);
        System.out.println("The maximum value is: " + max);
        System.out.println("The number of guesses is: " + count);

        // Close resources
        fileScanner.close();
        input.close();
    }

}
