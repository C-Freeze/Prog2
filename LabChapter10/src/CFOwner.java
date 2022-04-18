//CFOwner.java
// Carter Freeze
// 4/16/22
// Owner Class

public class CFOwner extends CF_BJEmployee{
    
    //instance variables
    private double annualSalary;
    private double ownershipPercentage;

    //constructor - Due to the nature of this class, allowing a no or few arg constructer would be highly inadvisable. 
    public CFOwner(String name, String date, String employeeNumber, double annualSalary, double ownershipPercentage) {
        super(name, date, employeeNumber);
        this.annualSalary = annualSalary;
        this.ownershipPercentage = ownershipPercentage;
    }

    //getters and setters
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getOwnershipPercentage() {
        return ownershipPercentage;
    }

    public void setOwnershipPercentage(double ownershipPercentage) {
        this.ownershipPercentage = ownershipPercentage;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nAnnual Salary: %.2f\nOwnership Percentage: %.2f", annualSalary, (ownershipPercentage*100));
    }
}
