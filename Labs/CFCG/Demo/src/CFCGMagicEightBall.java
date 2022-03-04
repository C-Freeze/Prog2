//MagicEightBall.java
// Carter Freeze
// 2/25/2022
// This program will ask the user a question and then return a random answer

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class CFCGMagicEightBall {
    public static void main(String[] args) throws FileNotFoundException {
        // Initialize Objects
        File f = new File("./8_ball_responses.txt"); // File to read from
        Scanner sc = new Scanner(f); // Scanner to read from file
        Random r = new Random();

        // Load file lines into array
        String[] lines = new String[(int) f.length()]; // Create array of size of file, this is a bit of a hack to
                                                       // guarantee that the array is the correct size
                                                       // since the extra metadata is not included in the file
                                                       // Ill then just create my own length variable
                                                       // This is probably a bad idea, but it works
        int i = 0;
        while (sc.hasNextLine()) {
            lines[i] = sc.nextLine();
            i++;
        }

        sc.close(); // Done reading file - close scanner

        // Ask user for question
        System.out.print("Ask a question: ");
        Scanner input = new Scanner(System.in);
        input.nextLine();
        input.close(); // Close scannerd
        // Not storing, because I don't need it, this is dumb

        // Get random line from array
        int randomLine = r.nextInt(i);
        String answer = lines[randomLine];

        // Print answer
        System.out.println("Response: " + answer);
    }
}
