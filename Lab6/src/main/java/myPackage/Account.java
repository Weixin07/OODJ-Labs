package myPackage;

public class Account {

    int acno;
    double balance;
    double annualInterestRate;

    public int getAcno() {
        return acno;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    //From here
    Account(int ac, double bal, double air) {
        acno = ac;
        balance = bal;
        annualInterestRate = air;
    }
    //Till here
    //This is a constructor, which is a method inside a class to make an object

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}
