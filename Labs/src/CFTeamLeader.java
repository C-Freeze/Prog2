//CFTeamLeader.java
// 3/29/2022
// Carter Freeze
// Class for Team Leader
public class CFTeamLeader extends CFProductionWorker{
    // instance variables
    private double bonus; // Monthly bonus
    private int requiredHours; //Required hours of training

    // constructor
    public CFTeamLeader(String name, String employeeNumber, String hireDate, int shift, double hourlyPayRate, double bonus, int requiredHours) {
        super(name, employeeNumber, hireDate, shift, hourlyPayRate);
        this.bonus = bonus;
        this.requiredHours = requiredHours;
    }

    public CFTeamLeader(String name, int shift, double hourlyPayRate, double bonus, int requiredHours) {
        super(name, shift, hourlyPayRate);
        this.bonus = bonus;
        this.requiredHours = requiredHours;
    }

    // Getters and Setters
	public double getBonus() {
		return this.bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public int getRequiredHours() {
		return this.requiredHours;
	}

	public void setRequiredHours(int requiredHours) {
		this.requiredHours = requiredHours;
	}

    @Override
    public String toString() {
        return String.format("%s\nBonus: $%.2f\nRequired Hours: %d", super.toString(), this.bonus, this.requiredHours);
    }
}
