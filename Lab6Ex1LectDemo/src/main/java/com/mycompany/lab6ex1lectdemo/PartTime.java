/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6ex1lectdemo;

/**
 *
 * @author Faith
 */
public class PartTime extends Staff {

    private int hoursWorked;

    public void calculateSalary() {
        super.salary = hoursWorked * 1.5;
    }
    
        @Override
    public String toString() {
        return "Part Time: " + this.name + this.salary;
    }
}
