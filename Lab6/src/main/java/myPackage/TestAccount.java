package myPackage;

public class TestAccount {

    public static void main(String[] args) {

        Checking cacc = new Checking(1002, 2000, 5.4);
        System.out.println("Account Number: " + cacc.getAcno());
        System.out.println("Account Balance: " + cacc.getBalance());
        System.out.println("Account AIR: " + cacc.getAnnualInterestRate());
        cacc.withdraw(2010);
        System.out.println("New balance after withdraw: " + cacc.getBalance());

        Savings sacc = new Savings(1111, 2500, 4.5);
        System.out.println("Account Number: " + sacc.getAcno());
        System.out.println("Account Balance: " + sacc.getBalance());
        System.out.println("Account AIR: " + sacc.getAnnualInterestRate());
        sacc.withdraw(2501);
        System.out.println("New balance after withdraw: " + sacc.getBalance());
    }
}
