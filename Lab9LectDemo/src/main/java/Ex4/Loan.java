/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex4;

/**
 *
 * @author Faith
 */
import java.util.Date;

public class Loan {

    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    public Loan() {

    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        super();
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = new java.util.Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public java.util.Date getLoanDate() {
        return loanDate;
    }

    public double monthlyPayment() {
        return 1000;
    }

    public double totalPayment() {
        return 100000;
    }

    public static void main(String[] args) {
        Loan loan1 = new Loan(4.5, -5, 20000);

        if (loan1.annualInterestRate == 0 || loan1.numberOfYears == 0 || loan1.loanAmount == 0) {
            throw new IllegalArgumentException();
        } else if (loan1.annualInterestRate < 0 || loan1.numberOfYears < 0 || loan1.loanAmount < 0) {
            throw new IllegalArgumentException();
        }
        System.out.println("End of Programme.");

    }

}
