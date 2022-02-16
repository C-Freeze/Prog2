public class Patient {
    // Class args
    // Name
    private String firstName;
    private String middleName;
    private String lastName;

    // Address
    private String address;
    private String city;
    private String state;
    private int zip; // 5 digits

    // Contact info
    private String phone;

    // Emergency contact
    private String contactName;
    private String contactPhone;

    // Constructor
    // This is an abomination of code of a header
    public Patient(String firstName, String middleName, String lastName, String address, String city, String state,
            int zip, String phone, String contactName, String contactPhone) {

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.contactName = contactName;
        this.contactPhone = contactPhone;
    }

    // Accessors
    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + middleName + " " + lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZip() {
        return zip;
    }

    public String getFormattedAddress() { //TODO: May not want the newline
        return address + ", " + city + ", " + state + " " + zip;
    }

    public String getPhone() {
        return phone;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    // Mutators
    // Also going to just assume all 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String Address) {
        this.address = Address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public void setZip(String zip) {
        this.zip = Integer.parseInt(zip);
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    //To String Override
    @Override
    public String toString() {
        return "Patient: " + getName()
                + "\nAddress: " + getFormattedAddress() 
                + "\nPhone Nubmer: " + getPhone() 
                + "\nEmergancy Contact: " + getContactName() 
                + "\nContact Number: " + getContactPhone();
    }
}
