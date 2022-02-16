// CFreez00E1P1.java
// Carter Freeze
// 2/7/2022
// Exam 1 Part 1

import java.util.Random;

public class CFreez00E1P1 {
    public static void main(String[] args) throws Exception {
        // Array of 15 rand ints between 1 and 100
        int[] randInts = new int[15];
        Random rand = new Random();

        for (int i = 0; i < randInts.length; i++) {
            randInts[i] = rand.nextInt(100) + 1; // rand int between 1 and 100
        }

        displayGrades(randInts);
        int[] gradeCounts = getDistribution(randInts); //I dont like the way this looks here.
        displayDistribution(gradeCounts);
        displayAverage(randInts);

    }

    private static void displayGrades(int[] randInts) {
        // Display the grades, from the generated array
        for (int i = 0; i < randInts.length; i++) {
            String letterGrade = gradeToLetter(randInts[i]);
            System.out.printf("Student %2d: %3d  %s\n", i + 1, randInts[i], letterGrade);
        }
    }

    private static void displayAverage(int[] gradeCounts) {
        //Display average of the array of grades
        int sum = 0;
        for (int i = 0; i < gradeCounts.length; i++) {
            sum += gradeCounts[i];
        }
        double average = (double) sum / gradeCounts.length;
        System.out.printf("Average: %.2f\n", average);
    }

    private static void displayDistribution(int[] gradeCounts) {
        // Display the distribution of grades
        System.out.println("Distribution Summary");
        System.out.println("A's: " + gradeCounts[0]);
        System.out.println("B's: " + gradeCounts[1]);
        System.out.println("C's: " + gradeCounts[2]);
        System.out.println("D's: " + gradeCounts[3]);
        System.out.println("F's: " + gradeCounts[4]);
    }

    private static String gradeToLetter(int grade){
        //Takes in a grade and returns the corresponding letter grade
        String letterGrade = "";
        if(grade >= 90){
            letterGrade = "A";
        }
        else if(grade >= 80){
            letterGrade = "B";
        }
        else if(grade >= 70){
            letterGrade = "C";
        }
        else if(grade >= 60){
            letterGrade = "D";
        }
        else{
            letterGrade = "F";
        }

        return letterGrade;
    }

    private static int[] getDistribution(int[] grades){
        //Takes in an array of grades and returns an array of the number of each grade
        int[] distribution = new int[5];
        for(int i = 0; i < grades.length; i++){
            int grade = grades[i];
            if(grade >= 90){
                distribution[0]++;
            }
            else if(grade >= 80){
                distribution[1]++;
            }
            else if(grade >= 70){
                distribution[2]++;
            }
            else if(grade >= 60){
                distribution[3]++;
            }
            else{
                distribution[4]++;
            }
        }
        return distribution;
    }
}