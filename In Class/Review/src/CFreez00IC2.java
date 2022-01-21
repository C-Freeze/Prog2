import java.util.Scanner;

// CFreez00IC2.java
// Carter Freeze
// 1/21/2022
// Speed Trap - Based on 'In-class 2 methods speedTrap.pdf'
public class CFreez00IC2 {
    public static void main(String[] args) {
        // User inputs
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the speed limit: ");
        int speedLimit = input.nextInt();
        System.out.print("Enter the driver's speed: ");
        int driverSpeed = input.nextInt();
        System.out.print("Enter the number previous tickets, in the past year: ");
        int tickets = input.nextInt();
        input.close();

        // Calculations
        int fine, reckless; // reck
        fine = calcFine(speedLimit, driverSpeed);
        
        double penalty = calcPenalty(fine, tickets);
        
        if (driverSpeed - speedLimit > 40) // if speeding more than 40 mph
            reckless = calcReckless(speedLimit, driverSpeed);
        else
            reckless = 0;

        // Output
        System.out.printf("Fine:     $%,d.00\n", fine);
        System.out.printf("Penalty:  $%,.2f\n", penalty);
        System.out.printf("Reckless: $%,d.00\n", reckless);
        System.out.printf("Total:    $%,.2f\n", fine + penalty + reckless);
    }

    private static int calcReckless(int speedLimit, int driverSpeed) {
        // For every mph over, 40mph over, the speed limit, the driver is charged $150
        return ((driverSpeed - speedLimit) - 40) * 150;
    }

    private static double calcPenalty(int fine, int tickets) {
        // If the tickets are less than 2, the penalty is 0.
        if (tickets < 2) {
            return 0;
        }
        return (double) fine / 3; // If the tickets are 2 or more, the penalty is a third of the normal fine.
    }

    private static int calcFine(int speedLimit, int driverSpeed) {
        // If drive is over speed limit, but less that 15 mph over, fine is $250
        if (driverSpeed > speedLimit && driverSpeed <= (speedLimit + 15)) {
            return 250;
            // Else if drive is over speed limit more than 15, but less that 30 mph over,
            // fine is $350
        } else if (driverSpeed > speedLimit && driverSpeed <= (speedLimit + 30)) {
            return 350;
            // Else if drive is over speed limit more than 30, the fine is $450
        } else if (driverSpeed > speedLimit) {
            return 450;
            // Else if drive is under speed limit, the fine is $0
        } else {
            return 0;
        }
    }
}