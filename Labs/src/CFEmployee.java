// CFEmployee.java
// 3/29/2022
// Carter Freeze
// Base Employee Class
import java.util.Calendar;
import java.util.Random;
public class CFEmployee {
    // instance variables
    private String name;
    private String employeeNumber; // This will be in the format III-L, where III is the employee number and L is a
                                   // letter (A-M)
    private String hireDate; // This will be in the format MM/DD/YYYY
    
    // constructor, the lazy one
    public CFEmployee(String name, String employeeNumber, String hireDate) {
        setName(name);
        setEmployeeNumber(employeeNumber);
        setHireDate(hireDate);
    }

    public CFEmployee(String name) {
        Random rand = new Random();

        // Set Name
        this.name = name;

        // Generate Employee Number
        char empChar = (char) (rand.nextInt(13) + 'A'); // random letter between A and M
        this.employeeNumber = String.format("%d-%s", rand.nextInt(1000), empChar);

        // Set Hire Date to Today
        Calendar date = Calendar.getInstance();
        this.hireDate = String.format("%02d/%02d/%04d", date.get(Calendar.MONTH) + 1, date.get(Calendar.DAY_OF_MONTH),
                date.get(Calendar.YEAR));
    }

    // getters and setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeNumber() {
        return this.employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        // Regex to check if the employee number is in the correct format
        if (employeeNumber.matches("[0-9]{3}-[A-M]")) {
            this.employeeNumber = employeeNumber;
        } else {
            System.out.println("Invalid employee number format");
            return;
        }
    }

    public String getHireDate() {
        return this.hireDate;
    }

    public void setHireDate(String hireDate) {
        // Regex to check if the hire date is in the correct format
        if (hireDate.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")) {
            this.hireDate = hireDate;
        } else {
            System.out.println("Invalid hire date format");
            return;
        }
    }

    // toString
    @Override
    public String toString() {
        return String.format("%s, %s, %s", this.name, this.employeeNumber, this.hireDate);
    }

    public static void main(String[] args) {
        CFEmployee emp1 = new CFEmployee("John Smith");

        System.out.println(emp1);
    }
}