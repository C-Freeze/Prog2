public class GradedActivity {
    // Instance variables
    private double score;

    // Accessor
    public double getScore() {
        return score;
    }

    // Mutator
    public void setScore(double s) {
        score = s;
    }

    // Method
    public char getGrade() {
        char letterGrade;

        if (score >= 90)
            letterGrade = 'A';
        else if (score >= 80)
            letterGrade = 'B';
        else if (score >= 70)
            letterGrade = 'C';
        else if (score >= 60)
            letterGrade = 'D';
        else
            letterGrade = 'F';

        return letterGrade;
    }
}
