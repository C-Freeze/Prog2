
public class CF_BJTeamLeader extends CF_BJProductionWorker {

	double monthlyBonus = 1200;
	int requiredHours = 40;
	int requiredTrainHours = 10;

	// public CF_BJTeamLeader(int shift, double payPerHour, String name, String
	// date) {
	public CF_BJTeamLeader(int shift, double payPerHour, String name, String date, String employeeNumber) {
		super(shift, payPerHour, name, date, employeeNumber);
	}

	public CF_BJTeamLeader(String name) {
		super(name);
	}

	public double getMonthlyBonus() {
		return monthlyBonus;
	}

	public void setMonthlyBonus(double monthlyBonus) {
		this.monthlyBonus = monthlyBonus;
	}

	public int getRequiredHours() {
		return requiredHours;
	}

	public void setRequiredHours(int requiredHours) {
		this.requiredHours = requiredHours;
	}

	public int getRequiredTrainHours() {
		return requiredTrainHours;
	}

	public void setRequiredTrainHours(int requiredTrainHours) {
		this.requiredTrainHours = requiredTrainHours;
	}

	// Recieved once per month
	public double calcPayWithBonus() {
		int hoursPerDay = super.getWorkersHours();
		double totalPay = hoursPerDay * 10 * super.getHourlyPay() + this.getMonthlyBonus();

		return totalPay;
	}

	public double calcPay() {
		int hoursPerDay = super.getWorkersHours();
		double totalPay = hoursPerDay * 10 * super.getHourlyPay();

		return totalPay;
	}

}
