import java.util.Scanner;

public class ConvertTry {
    public static void main(String[] args) {
        // Have the user enter a distance in meters
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a distance in meters: ");
        double meters = input.nextDouble();

        //Ensure that the user enters a positive number
        while (meters < 0) {
            System.out.println("Please enter a positive number: ");
            meters = input.nextDouble();
        }

        // Display the menu
        int userChoice = DisplayMenu();

        // Convert the distance to the user's choice

        while (true) {
            switch (userChoice) {
                case 1:
                    ConvertKilometers(meters);
                    break;
                case 2:
                    ConvertInches(meters);
                    break;
                case 3:
                    ConvertFeet(meters);
                    break;
                case 4:
                    // Close the program
                    input.close(); // Close the scanner
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice!");
                    break;
            }
            userChoice = DisplayMenu();
        }
    }

    private static void ConvertFeet(double meters) {
        double feet = meters * 3.281;
        System.out.println(meters + " meters is " + feet + " feet.");
    }

    private static void ConvertInches(double meters) {
        double inches = meters * 39.37;
        System.out.println(meters + " meters is " + inches + " inches.");
    }

    private static void ConvertKilometers(double meters) {
        double kilometers = meters / 1000;
        System.out.println(meters + " meters is " + kilometers + " kilometers.");
    }

    private static int DisplayMenu() {
        Scanner input = new Scanner(System.in); // Create a scanner object

        // Display the menu
        System.out.println("\nConversion Menu");
        System.out.println("1. Kilometers");
        System.out.println("2. Miles");
        System.out.println("3. Feet");
        System.out.println("4. Quit");
        System.out.print("Enter your choice: ");

        // Get the user's choice
        int choice = input.nextInt();
        input.nextLine(); // Clear the input buffer

        // Return the user's choice
        return choice;
    }

}
