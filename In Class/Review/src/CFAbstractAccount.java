//CFAbstractAccount.java
//Carter Freeze
//4/7/2022
//This is the abstract class for the account

public abstract class CFAbstractAccount{

    //instance variables
    private double balance;
    private int monthDeposits;
    private int monthWithdrawals;
    private double annualInterestRate;
    private double monthlyServiceCharge;

    //Constructors
    public CFAbstractAccount(){
        balance = 0;
        monthDeposits = 0;
        monthWithdrawals = 0;
        annualInterestRate = 0;
        monthlyServiceCharge = 0;
    }

    public CFAbstractAccount(double balance, double annualInterestRate){
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        monthDeposits = 0;
        monthWithdrawals = 0;
        monthlyServiceCharge = 0;
    }

    //Accessors and Mutators
    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getMonthDeposits() {
        return this.monthDeposits;
    }

    public void setMonthDeposits(int monthDeposits) {
        this.monthDeposits = monthDeposits;
    }

    public int getMonthWithdrawals() {
        return this.monthWithdrawals;
    }

    public void setMonthWithdrawals(int monthWithdrawals) {
        this.monthWithdrawals = monthWithdrawals;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyServiceCharge() {
        return this.monthlyServiceCharge;
    }

    public void setMonthlyServiceCharge(double monthlyServiceCharge) {
        this.monthlyServiceCharge = monthlyServiceCharge;
    }

    //Methods
    public void addServiceCharge(double monthlyServiceCharge){
        this.monthlyServiceCharge += monthlyServiceCharge;
    }

    public void deposit(double amount){
        balance += amount;
        monthDeposits++;
    }

    public void withdraw(double amount){
        balance -= amount;
        monthWithdrawals++;
    }

    public void calcInterest(){
        balance += balance * (annualInterestRate/12); //calculates the interest, then adds it to the balance
    }

    public void monthlyProcess(){
        balance -= monthlyServiceCharge; //subtracts the monthly service charge from the balance
        calcInterest(); //calls the calcInterest method
        monthDeposits = 0; //resets the monthly deposits
        monthWithdrawals = 0; //resets the monthly withdrawals
        monthlyServiceCharge = 0; //resets the monthly service charge
    }

}