/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6ex1lectdemo;

/**
 *
 * @author Faith
 */
public class Employee extends Person {

    protected String office;
    protected double salary;
    protected MyDate dateHired;

    @Override
    public String toString() {
        return "Employee: " + super.name;
    }
}
