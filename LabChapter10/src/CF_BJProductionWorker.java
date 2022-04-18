// CF_BJEmployee.java
// Carter Freeze
// 4/16/22
// Produvtion Worker Class

public class CF_BJProductionWorker extends CF_BJEmployee {

	private int workersShift;
	private int workersHours = 8;
	private double hourlyPay;

	public int getWorkersShift() {
		return workersShift;
	}

	public void setWorkersShift(int workersShift) {
		this.workersShift = workersShift;
	}

	public double getHourlyPay() {
		return hourlyPay;
	}

	public void setHourlyPay(double hourlyPay) {
		this.hourlyPay = hourlyPay;
	}

	public int getWorkersHours() {
		return workersHours;
	}

	public void setWorkersHours(int workersHours) {
		this.workersHours = workersHours;
	}

	public CF_BJProductionWorker(int shift, double payPerHour, String name, String date, String employeeNumber) {
		super(name, date, employeeNumber);
		workersShift = shift;
		hourlyPay = payPerHour;
		// super.setEmployeeName(name);
		// super.setHireDate(date);
	}

	// public CF_BJProductionWorker(int shift, double payPerHour, String name,
	// String date) {
	public CF_BJProductionWorker(String name) {
		super(name);
		workersShift = 1;
		hourlyPay = 11.00;
		// super.setEmployeeName(name);
		// super.setHireDate(date);
	}

	@Override
	public String toString() {
		return super.toString() + "\nWorkers Shift: " + workersShift + "\nHourly Pay: " + hourlyPay;
	}
}