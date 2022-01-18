import java.util.Scanner;

// CFreez00IC1.java
// Carter Freeze
// 1/14/2022
// Pet Selecto - written based on requirements in 'Inclass1 IF Pets add 2.pdf'
public class CFreez00IC1 {

    public static void main(String[] args) {
        // Constants
        final String[] availablePets = { "Cat", "Dog", "Parrot", "Fish" }; // Array of available pets
        Scanner input = new Scanner(System.in); // Scanner object for user input

        // Get user input
        display_options(availablePets);
        String petChoice = input.nextLine(); // Technically, I think I only need a char here, but this wont hurt

        // switch (petChoice) {
        // case "C": // Cat
        // System.out.println("Cat - $75");
        // System.out.println("Grats, on the cat! Make sure to grab some catnip!");
        // break;

        // case "D": // Dog
        // if (handleDog()) { // True for a big dog, false for a small dog
        // System.out.println("Large Dog - $120");
        // System.out.println("Grats, on the large dog! Make sure to grab some dog
        // food!");

        // } else {
        // System.out.println("Dmall Dog - $80");
        // System.out.println("Grats, on the small dog! Make sure to grab some dog
        // treats!");
        // }

        // break;

        // case "P": // Parrot
        // System.out.println("Parrot - $50");
        // System.out.println("Grats, on the parrot! Make sure to grab a bird cage!");
        // break;

        // case "F": // Fish
        // System.out.println("Fish - $25");
        // System.out.println("Grats, on the fish! Make sure to grab some fish food!");
        // break;

        // default:
        // System.out.println("Invalid pet choice");
        // break;

        // }

        if (petChoice.equals("C")) { // Cat
            System.out.println("Cat - $75");
            System.out.println("Grats, on the cat! Make sure to grab some catnip!");
        } else if (petChoice.equals("D")) { // Dog
            if (handleDog()) { // True for a big dog, false for a small dog
                System.out.println("Dog - $120");
                System.out.println("Grats, on the large dog! Make sure to grab some dog food!");

            } else {
                System.out.println("Dog - $80");
                System.out.println("Grats, on the small dog! Make sure to grab some dog treats!");
            }

        } else if (petChoice.equals("P")) { // Parrot
            System.out.println("Parrot - $50");
            System.out.println("Grats, on the parrot! Make sure to grab a bird cage!");
        } else if (petChoice.equals("F")) { // Fish
            System.out.println("Fish - $25");
            System.out.println("Grats, on the fish! Make sure to grab some fish food!");
        } else {
            System.out.println("Invalid pet choice");
        }

        // Close resources
        input.close();
    }

    private static void display_options(String[] availablePets) {
        // Display all available pets types and key to enter to select
        System.out.println("Please select a pet type by entering the corresponding letter:");
        for (String pet : availablePets) {
            System.out.printf("%s - %s\n", pet.charAt(0), pet);
        }
    }

    private static boolean handleDog() {

        Scanner input = new Scanner(System.in); // Scanner object for user input
        System.out.println("Is your dog a large dog or a small dog?");
        System.out.println("Enter L for big dog, S for small dog.");
        String dogChoice = input.nextLine();

        if (dogChoice.equals("L")) { // Big dog
            input.close();
            return true;

        } else if (dogChoice.equals("S")) { // Small dog
            input.close();
            return false;

        } else { // invalid input
            System.out.println("Invalid input.");
            input.close();
            System.exit(0);
        }
        return false;
    }
}