import java.util.Scanner;

public class GradeDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int finalQuestions, missed;

        System.out.print("Enter the number of final exam questions: ");
        finalQuestions = input.nextInt();

        System.out.print("Enter the number of questions missed: ");
        missed = input.nextInt();

        FinalExam finalExam = new FinalExam(finalQuestions, missed);

        System.out.println("finalExam = " + finalExam);
        System.out.println("Final Exam Grade = " + finalExam.getGrade());

        input.close();
    }
}
