package myPackage;

public class Checking extends Account {
    int overdraftlimit = 50;
    
    public Checking(int ac, double bal, double air){
    super(ac, bal, air);
    }
    //Although the superclass contructor won't be inherited automatically, it can be called by using the "super" term and just update the attributes from the subclass contructor.

    public int getOverdraftlimit() {
        return overdraftlimit;
    }

    public void setOverdraftlimit(int overdraftlimit) {
        this.overdraftlimit = overdraftlimit;
    }
    
    //this is called method overriding cuz the signature is the same, and will be executed during runtime (An example of runtime polymorphism)
    @Override
    public void withdraw(double amount){
    if (amount <= (balance + overdraftlimit)){
    balance -= amount;
    System.out.println("Successful transaction.");
    }else{
    System.out.println("Sorry overdraft limit has reached.");
    }    
    }
}
