// CF_BJEmployee.java
// Carter Freeze
// 4/16/22
// Base Employee Class

import java.util.Calendar;

public class CF_BJEmployee {

	private String employeeName;
	private String employeeNumber;
	private String hireDate;

	public CF_BJEmployee(String name, String date, String employeeNumber) { // Constructor
		employeeName = name;
		hireDate = date;
		// employeeNumber = "";
		this.employeeNumber = employeeNumber;
	}

	public CF_BJEmployee(String name) { // Constructor

		employeeName = name;

		// Get the current date, and format it as mm/dd/yyyy
		Calendar date = Calendar.getInstance();
		this.hireDate = String.format("%02d/%02d/%04d", date.get(Calendar.MONTH) + 1, date.get(Calendar.DAY_OF_MONTH),
				date.get(Calendar.YEAR));

		// Auto Generate Employee Number
		employeeNumber = generateEmployeeNumber();
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String generateEmployeeNumber() {
		// generate a random 3 digit number as a string, add a dash, and add a letter
		// A-M
		String employeeNumber = String.format(
				"%3d-%s", // Format
				(int) (Math.random() * 1000), // Random number between 0 and 1000, non inclusive
				(char) ((int) (Math.random() * 26) + 65) + ""); // Random letter between A and M

		return employeeNumber;

	}

	@Override
	public String toString() {
		return "Name: " + employeeName + "\n" + "Hire Date: " + hireDate + "\n";
	}

}
