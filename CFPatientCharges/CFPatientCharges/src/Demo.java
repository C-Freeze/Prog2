public class Demo {
    public static void main(String[] args) {
        // Create a new patient
        Patient p = new Patient(
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
        Procedure proc1 = new Procedure("Physical Exam", "02/16/2022", "Dr. Irvine", 250.00);
        Procedure proc2 = new Procedure("X-Ray", "02/16/2022", "Dr. Jamison", 500.00);
        Procedure proc3 = new Procedure("Blood Test", "02/16/2022", "Dr. Irvine", 200.00);

        // Print Patient and Procedure Info
        System.out.println(p.toString());
        System.out.println("\n" + proc1.toString());
        System.out.println("\n" + proc2.toString());
        System.out.println("\n" + proc3.toString());
    }
}
