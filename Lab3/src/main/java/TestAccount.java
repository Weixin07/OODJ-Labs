/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Faith
 */
public class TestAccount {
    public static void main(String[] args){
    Account ac1 = new Account(1222, 20000, 0.045);
    
    //Alternatively, you can set the values like so:
    //ac1.setId(1222);
    //ac1.setBalance(20000);
    //ac1.setAnnualInterestRate(0.045);
    System.out.println("id: " + ac1.getId());
    System.out.println("Balance: " + ac1.getBalance());
    System.out.println("Annual Interest Rate: " + ac1.getAnnualInterestRate());
    
    ac1.withdraw(2500);
    ac1.deposit(3000);
     System.out.println("Balance: " + ac1.getBalance());
    System.out.println("Annual Interest Rate: " + ac1.getAnnualInterestRate()/12);
    }
}
