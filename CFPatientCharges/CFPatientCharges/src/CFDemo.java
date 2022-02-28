// CFPatient.java
// 2/21/2022
// Carter Freeze
// Patient Class

public class CFDemo {
    public static void main(String[] args) {
        // Create a new patient
        CFPatient p = new CFPatient(
                "John",
                "Smith",
                "Doe",
                "123 Main St.",
                "Anytown",
                "CA",
                12345,
                "555-555-5555",
                "Jane Smith",
                "555-555-5555");

        // Create a new procedures, this should be a list of procedures that the patient has
        CFProcedure proc1 = new CFProcedure("Physical Exam", "02/16/2022", "Dr. Irvine", 250.00);
        CFProcedure proc2 = new CFProcedure("X-Ray", "02/16/2022", "Dr. Jamison", 500.00);
        CFProcedure proc3 = new CFProcedure("Blood Test", "02/16/2022", "Dr. Irvine", 200.00);

        // Print Patient and Procedure Info
        System.out.println(p);
        System.out.println("\n" + proc1);
        System.out.println("\n" + proc2);
        System.out.println("\n" + proc3);
    }
}
