import java.util.Scanner;

// CFreez00Lab1.java
// Carter Freeze
// 1/30/2022
// Lab 1, Milage calculator - written based on requirements in Sp22Lab1Milage.PDF

public class CFreez00Lab1 {
    public static void main(String[] args) {
        
        // Constants
        final int NUM_MEETINGS = 46; // number of class meetings

        // Delcare known variables, these aren't defined as constants in the lab sheet,
        // though they are.
        String name = "Carter Freeze";
        int distToSchool = 3; // in miles, based off of google maps data
        int timeToSchool = 10; // in minutes, based off of google maps data
        double milesPerGallon = 30.0; // in miles per gallon

        // User input
        double pricePerGallon = getPriceOfGas();

        // Build array of table values
        double[] milageReport = generateReport(distToSchool, timeToSchool, milesPerGallon, pricePerGallon, NUM_MEETINGS);

        // Print table
        printReport(milageReport, name);
    }

    private static void printReport(double[] milageReport, String name) {

        // Print header
        System.out.printf("Student mileage report %21s\n", name);

        System.out.println("============================================"); // All lines are going to attempt to be thesame length
        
        System.out.printf("Miles per trip %29d\n", (int) milageReport[0]);
        
        System.out.printf("Mileage this semester %22d\n", (int) milageReport[1]);
        
        //Format price per gallon to 2 decimal places
        String pricePerGalString = String.format("$%.2f", milageReport[2]);
        System.out.printf("Cost of gas per gallon %21s\n", pricePerGalString);
        
        System.out.printf("Miles per gallon %27.1f\n", milageReport[3]);

        //Format price per trip
        String pricePerTripString = String.format("$%.2f", milageReport[4]);
        System.out.printf("Cost of gas per trip %23s\n", pricePerTripString);

        System.out.printf("Number of trips %28d\n", (int) milageReport[5]);

        System.out.printf("Hours/min in the car %10d hours %2d min\n", ((int) milageReport[6] / 60),((int) milageReport[6] % 60)); // So I don't have to store the hours and minutes separately
        
        //Print final price with 2 decimal places, dollar sign and justify right
        String finalPriceString = String.format("$%.2f", milageReport[7]);
        System.out.printf("Cost of gas for the semester %15s\n", finalPriceString);
        
    }

    private static double[] generateReport(int distToSchool, int timeToSchool, double milesPerGallon,
            double pricePerGallon, int numMeetings) {

        // Intialize array, 8 elements
        double[] milageTable = new double[8];

        // Calculate each element of the array, this also exists as a array definition
        // in the lab sheet
        milageTable[0] = MilesPerTrip(distToSchool); // Assuming we mean a round trip
        milageTable[1] = MileageForSemester(milageTable[0], numMeetings);
        milageTable[2] = pricePerGallon;
        milageTable[3] = milesPerGallon;
        milageTable[4] = CostPerTrip(pricePerGallon, milesPerGallon, milageTable[0]);
        milageTable[5] = numMeetings;
        milageTable[6] = TimeSpentInCar(timeToSchool, numMeetings); // in minutes
        milageTable[7] = CostPerSemester(milageTable[4], numMeetings);

        // Return the array
        return milageTable;
    }

    public static double getPriceOfGas() {
        // initialize variable and scanner
        double pricePerGallon = -1.0;
        Scanner input = new Scanner(System.in);

        // get user input and validate
        while (pricePerGallon < 0) {

            System.out.print("Please enter the current price of gas per gallon: ");
            pricePerGallon = input.nextDouble();
            if (pricePerGallon < 0) {
                System.out.println("Please enter a positive number.");
            }
        }

        // close scanner to prevent resource leak and return value
        input.close();
        return pricePerGallon;
    }

    private static double CostPerSemester(double costPerTrip, int numMeetings) {
        return costPerTrip * numMeetings;
    }

    private static double TimeSpentInCar(int timeToSchool, int numMeetings) {
        return (double) timeToSchool * numMeetings; // cast to double, this is actually an int however
    }

    private static double CostPerTrip(double pricePerGallon, double milesPerGallon, double dist) {
        return pricePerGallon * (dist / milesPerGallon);
    }

    private static double MileageForSemester(double dist, int numMeetings) {
        return dist * numMeetings;
    }

    private static double MilesPerTrip(int dist) {
        return 2 * dist; // Assuming we mean a round trip
    }
}
