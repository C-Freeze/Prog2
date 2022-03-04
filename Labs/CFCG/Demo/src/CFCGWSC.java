//WSC.java
// Carter Freeze
// 2/25/2022
// This program will return the number of times a team has won the world series

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CFCGWSC {
    public static void main(String[] args) throws FileNotFoundException {
        // Initialize Objects
        File f = new File("./WorldSeriesWinners.txt"); // File to read from
        Scanner sc = new Scanner(f); // Scanner to read from file
        Scanner input = new Scanner(System.in); // Scanner to read from user

        // Initialize Variables
        ArrayList<String> teams = new ArrayList<String>(); // ArrayList to hold the teams

        while (sc.hasNextLine()) { // While there are still lines to read
            teams.add(sc.nextLine()); // Add the next line to the arraylist
        }

        sc.close(); // Close the scanner

        // Get user input
        System.out.print("Enter a team: ");
        String userTeam = input.nextLine(); // Get team from user
        input.close(); // Close scanner

        int counter = 0; // Counter to keep track of how many times the team has won

        for (String team : teams) {
            if (team.toLowerCase().contains(userTeam.toLowerCase())) {
                counter++;
            }
        }

        // Print answer
        System.out.println("The " + userTeam + " have won " + counter + " times.");
    }
}