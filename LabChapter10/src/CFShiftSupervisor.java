//CFShiftSupervisor.java
// Carter Freeze
// 4/16/22
// Shift Supervisor Class

public class CFShiftSupervisor extends CF_BJEmployee{

    private int annualSalary;
    private int annualBonus;
    
    public CFShiftSupervisor(int salary, int bonus, String name, String date, String employeeNumber) {
        super(name, date, employeeNumber);
        annualSalary = salary;
        annualBonus = bonus;
    }
    
    public CFShiftSupervisor(int salary, int bonus, String name) {
        super(name);
        annualSalary = salary;
        annualBonus = bonus;
    }
    
    public int getAnnualSalary() {
        return annualSalary;
    }
    
    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }
    
    public int getAnnualBonus() {
        return annualBonus;
    }
    
    public void setAnnualBonus(int annualBonus) {
        this.annualBonus = annualBonus;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nAnnual Salary: " + annualSalary + "\nAnnual Bonus: " + annualBonus;
    }
    
}
