// CFProcedure.java
// 2/21/2022
// Carter Freeze
// Procedure Class

public class CFProcedure {
    // Class fields

    private String name;
    private String date;
    private String practitioner;
    private double charge;
    
    // Constructor
    public CFProcedure(String name, String date, String practitioner, double charge) {
        this.name = name;
        this.date = date;
        this.practitioner = practitioner;
        this.charge = charge;
    }

    // Accessors
    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getPractitioner() {
        return practitioner;
    }

    public double getCharge() {
        return charge;
    }

    // Mutators
    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPractitioner(String practitioner) {
        this.practitioner = practitioner;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }

    // toString Override
    @Override
    public String toString() {
        return "Procedure: " + name 
        + "\nDate: " + date 
        + "\nPractitioner: " + practitioner 
        + "\nCharge: " + charge;
    }


}
