package myPackage;

public class Savings extends Account {

    Savings(int ac, double bal, double air) {
        super(ac, bal, air);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= (balance)) {
            balance -= amount;
            System.out.println("Sucessful transaction!");
        } else {
            System.out.println("Sorry not enough balance!");
        }
    }
}
