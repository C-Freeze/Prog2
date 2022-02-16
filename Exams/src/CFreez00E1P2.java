// CFreez00E1P2.java
// Carter Freeze
// 2/7/2022
// Exam 1 Part 2

import java.util.Scanner;

public class CFreez00E1P2 {
    public static void main(String[] args) {
        // Get the number of servings from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of servings: ");
        int servings = input.nextInt();
        input.close();

        int batches = servings / 8; // Calculate the number of batches;
        int leftover = 0;
        if (servings % 8 != 0) { // If there is a remainder, add another batch
            batches++;
            leftover = 8 - (servings % 8); // Calculate the leftover servings;
        }

        int[] peaches = calcPeaches(batches); // Calculate the number of peaches per batch
        int butter = calcButter(batches); // Calculate the number of butter per batch
        int cakeMix = batches; // I could just pass batches...

        displayShopping(peaches, cakeMix, butter, batches, leftover);

    }

    private static int[] calcPeaches(int batches) {
        // Calculates the cans of peaches needed for the number of batches
        // Cans come in 29 and 15 ounce cans
        // We need 25 ounces of peaches per batch

        // This sucks, its not perfectly accurate, should always get enough peaches
        // though
        int[] peaches = new int[2];
        int ozPeaches = batches * 25;
        peaches[0] = (int) Math.floor(ozPeaches / 29.0);
        peaches[1] = (int) Math.ceil((ozPeaches % 29.0) / 15.0);

        return peaches;

    }

    private static int calcButter(int batches) {
        // We need a 1/3 of a cup of butter per batch
        // Calc required butter
        double reqButter = batches * (1 / 3.0); // total cups of butter needed

        // Butter comes in 2 cups sticks
        // Calc the number of sticks needed
        int numSticks = (int) Math.ceil(reqButter / 2.0);
        return numSticks;
    }

    private static void displayShopping(int[] peaches, int cakeMix, int butter, int batches, int leftover) {
        //This is just to clean up the printf statements
        double butterUsed = batches * (1/3.0);
        double totalButter = butter * 2.0;
        int peachesUsed = batches * 25;
        int totalPeaches = peaches[0] * 29 + peaches[1] * 15;
        
        // Display the shopping list
        System.out.println("GROCERY LIST FOR " + batches + " BATCHES OF COBBLER\n");
        System.out.printf("%4d 29 ounce cans of peaches\n", peaches[0]);
        System.out.printf("%4d 15 ounce cans of peaches\n", peaches[1]);
        System.out.printf("%4d Yellow Cake Mixes\n", cakeMix);
        System.out.printf("%4d Pounds of butter\n\n", butter);
        System.out.println("QUANTITIES USED\n");
        System.out.printf("%4d ounces of peaches used   %4d left over\n", peachesUsed, totalPeaches - peachesUsed);
        System.out.printf("%4.1f ounces of butter used   %4.1f left over\n\n", butterUsed, totalButter - butterUsed);
        System.out.println("LEFTOVER COBBLER\n");
        System.out.printf("There should be %d servings of cobbler left over, but don't count on it.", leftover);
    }
}
