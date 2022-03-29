//This calss extend the abstract class
public class FinalExam extends GradedActivity {
    // Instance variables
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    // Constructor
    public FinalExam(int questions, int missed) {

        numQuestions = questions;
        numMissed = missed;
        pointsEach = 100.0 / questions;

        super.setScore(calculateScore());
    }

    // Accessor
    public int getNumQuestions() {
        return numQuestions;
    }

    public int getNumMissed() {
        return numMissed;
    }

    public double getPointsEach() {
        return pointsEach;
    }

    // Mutator
    public void setNumQuestions(int questions) {
        numQuestions = questions;
    }

    public void setNumMissed(int missed) {
        numMissed = missed;
    }

    public void setPointsEach(double points) {
        pointsEach = points;
    }

    // Method
    private double calculateScore() {
        double score = 0.0;
        score = 100.0 - (numMissed * pointsEach);
        return score;
    }

    // Override the toString method
    public String toString() {
        return String.format("%s: %.2f", "Final Exam", super.getScore());
    }
}
