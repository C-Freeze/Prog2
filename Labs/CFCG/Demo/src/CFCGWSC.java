//WSC.java
// Carter Freeze && Cooper Gray
// 2/25/2022
// This program will return the number of times a team has won the world series

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CFCGWSC {
    public static void main(String[] args) throws FileNotFoundException {
        // Initialize Objects
        File f = new File("./WorldSeriesWinners.txt"); // File to read from
        Scanner sc = new Scanner(f); // Scanner to read from file
        Scanner input = new Scanner(System.in); // Scanner to read from user

        // Get user input
        System.out.print("Enter a team: ");
        String team = input.nextLine(); // Get team from user and convert to lowercase
        input.close(); // Close scannerd

        int counter = 0;
        while (sc.hasNextLine()) {
            // Read line
            String line = sc.nextLine().toLowerCase();

            // Check if team is in line
            if (line.contains(team.toLowerCase())) {
                // Increment counter
                counter++;
            }
        }
        sc.close(); // Done reading file - close scanner

        // I think the book wants me to use an array, but then you have to parse the
        // data multiple times. I refuse.

        // Print answer
        System.out.println("The " + team + " have won " + counter + " times.");
    }
}