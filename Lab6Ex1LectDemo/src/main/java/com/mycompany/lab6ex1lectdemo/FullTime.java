/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6ex1lectdemo;

/**
 *
 * @author Faith
 */
public class FullTime extends Staff {

    public void calculateSalary() {
        super.salary = 8000;

    }
    
        @Override
    public String toString() {
        return "Full Time: " + this.name + super.salary;
    }

}
