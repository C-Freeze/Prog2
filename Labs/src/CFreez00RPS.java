// CFreez00RPS.java
// Carter Freeze
// 2/2/2022
// Rock, Paper, Scissors

import java.util.Random;
import java.util.Scanner;

public class CFreez00RPS {
    public static void main(String[] args) {

        String compChoice = computerChoice();
        String userChoice = userChoice();

        System.out.println("Computer chose " + compChoice);
        System.out.println("You chose " + userChoice);

        determineWinner(userChoice, compChoice);

    }

    private static String computerChoice() {
        Random rand = new Random();
        int choice = rand.nextInt(3) + 1; // 1, 2, or 3
        switch (choice) {
            case 1:
                return "rock";

            case 2:
                return "paper";

            case 3:
                return "scissors";
        }
        return ""; // How did we get here?
    }

    private static String userChoice() {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        System.out.print("Enter your choice: ");
        
        int userChoice = input.nextInt();
        

        if (!isValid(userChoice)) { // If the user enters an invalid choice
            System.out.println("Invalid choice, please try again.");
            userChoice();
        }
        
        input.close(); // Close the scanner
        // convert userChoice from int to String
        if (userChoice == 1) {
            return "rock";
        } else if (userChoice == 2) {
            return "paper";
        } else {
            return "scissors";
        }
    }

    private static boolean isValid(int userChoice) {
        if (userChoice == 1 || userChoice == 2 || userChoice == 3) {
            return true;
        } else {
            return false;
        }
    }

    private static void determineWinner(String userChoice, String compChoice) {
        if (userChoice == compChoice) { // If the user and computer chose the same thing
            System.out.println("It's a tie!"); // Print out that it's a tie
                                               // This removes the having to check for a tie for every input choice

        } else if (userChoice == "rock") {
            if (compChoice == "paper") { // If the user chose rock and the computer chose paper
                System.out.println("You lose!");
            } else { // If the computer chose scissors
                System.out.println("You win!");
            }

        } else if (userChoice == "paper") {
            if (compChoice == "scissors") { // If the user chose paper and the computer chose scissors
                System.out.println("You lose!");
            } else { // If the computer chose rock
                System.out.println("You win!");
            }

        } else if (userChoice == "scissors") {
            if (compChoice == "rock") { // If the user chose scissors and the computer chose rock
                System.out.println("You lose!");
            } else { // If the computer chose paper
                System.out.println("You win!");
            }
        }
    }

}
