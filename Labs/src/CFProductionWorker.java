//ProductionWorker.java
// 3/29/2022
// Carter Freeze
// Class for Production Workers
public class CFProductionWorker extends CFEmployee {
    private int shift;
    private double hourlyPayRate;

    public CFProductionWorker(String name, String employeeNumber, String hireDate, int shift, double hourlyPayRate) {
        super(name, employeeNumber, hireDate);
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;
    }

    public CFProductionWorker(String name, int shift, double hourlyPayRate) {
        super(name);
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;
    }

    public int getShift() {
        return shift;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    @Override
    public String toString() {
        return String.format("%s\nShift: %d\nHourly Pay Rate: $%.2f", super.toString(), this.shift, this.hourlyPayRate);
    }

}