/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Faith
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    
    //This is called constructor overloading, as its Account again, but the signatures(variables) get changed
    //"Account" is a constructor as it has the same name with class(usually)
    Account(int myId, double myBalance, double myAnnualInterestRate){
        id = myId;
        balance = myBalance;
        annualInterestRate = myAnnualInterestRate;
    }
    //There are 2 types of methods: setter and getter
    // setter is to input data
    // getter is to display data
    
    public int getID(){
    return this.id;
    //"this" means this object (Getting the id from the top)
    //"id" is the variable "id" in this object
    }
    
    //You can auto generate code too
    //From here 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    //Till here
    
    public void withdraw(double amount){
    this.balance -= amount;
    }
    
    public void deposit(double amount){
    this.balance += amount;
    }
}
