/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myPackage;

/**
 *
 * @author Faith
 */
public class PartTime extends Staff{
    private int hoursWorked = 6;
    
    public void calculateSalary(){
    super.salary = hoursWorked * 1.5;
    }
}
