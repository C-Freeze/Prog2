// CFBankAccount.java
// Carter Freeze
// 3/14/2022
// Bank Account Class

import java.util.ArrayList;

public class CFBankAccount {

    private int numberId;
    private String holder;
    private double balance;

    public static void main(String[] args) {

        ArrayList<CFBankAccount> accounts = new ArrayList<CFBankAccount>();

        accounts.add(new CFBankAccount(0, "Carter Freeze", 57802.00));
        accounts.add(new CFBankAccount(1, "Nathan Painter", 50.00)); // Blame poor NFT choices
        accounts.add(new CFBankAccount(2, "McKenna Montez", 1000000.00));

        for (CFBankAccount a : accounts) {
            System.out.println(a);
        }

        System.out.println(); // Newline

        CFBankAccount Nathan2 = new CFBankAccount(accounts.get(2));

        System.out.println(accounts.get(2)); // OG account
        System.out.println(Nathan2); // Copy account

    }

    // Main Constructor
    public CFBankAccount(int accountNumber, String accountHolder, double accountValue) {

        this.holder = accountHolder;
        this.numberId = accountNumber;
        this.balance = accountValue;

    }

    // Copy Constuctor
    public CFBankAccount(CFBankAccount account) {

        this.holder = account.holder;
        this.numberId = account.numberId;
        this.balance = account.balance;
    }
    
    //Accessors
    public double getAccountValue() {
        return balance;
    }
    
    public int getAccountNumber() {
        return numberId;
    }
    
    public String getAccountHolder() {
        return holder;
    }
    
    //Mutators
    public void setAccountValue(double value) {
        this.balance = value;
    }

    public void setAccountNumber(int id) {
        this.numberId = id;
    }

    public void setAccountValue(String name) {
        this.holder = name;
    }

    //Instance methods
    public void deposit(double value) {
        this.balance += value;
    }

    public void withdraw(double value) {
        this.balance -= value;
    }

    //OVERRIDES
    @Override
    public String toString(){
        return String.format("Account: %8d, Holder: %20s, Value:%10.2f", numberId, holder, balance);
    }
}
