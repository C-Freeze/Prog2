public class CFSavingsAccount extends CFAbstractAccount {
    //Instance Variables
    private boolean isActive;

    //Constructors
    public CFSavingsAccount(){
        super();
        isActive = true;
    }

    public CFSavingsAccount(double balance, double annualInterestRate){
        super(balance, annualInterestRate);
        isActive = true;
    }

    //Methods
    public void checkIsActive(){
        if(this.getBalance() < 25){
            isActive = false;
        } else {
            isActive = true;
        }
    }

    @Override
    public void withdraw(double amount){
        checkIsActive(); //check if account is active
        if(isActive){ //if the account is active
            if(amount > 0){ //if the amount is greater than 0
                if(amount <= super.getBalance()){ //if the amount is less than or equal to the balance
                    super.withdraw(amount); //withdraw the amount
                }
                else{
                    System.out.println("Insufficient funds.");
                }
            }
            else{
                System.out.println("Invalid amount.");
            }
        }
        else{
            System.out.println("Account is inactive."); 
        }
    }

    @Override
    public void deposit(double amount){
            if(amount > 0){
                super.deposit(amount);
            }
            else{
                System.out.println("Invalid amount.");
            }
        }

    @Override
    public void monthlyProcess() {
        if(super.getMonthWithdrawals() > 4){
            super.addServiceCharge(super.getMonthWithdrawals() - 4); // add 1 dollar per withdrawal over 4
        }
        super.monthlyProcess(); //call the monthlyProcess method in the super class
        checkIsActive(); //check if account is still active
    }
}
