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

        while(fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            System.out.println(line);
        }

        // Close resources
        fileScanner.close();
        input.close();
    }

}
