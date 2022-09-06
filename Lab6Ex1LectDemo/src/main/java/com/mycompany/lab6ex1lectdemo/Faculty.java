/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6ex1lectdemo;

/**
 *
 * @author Faith
 */
public class Faculty extends Employee {

    protected int officeHours;
    protected int rank;

    @Override
    public String toString() {
        return "Faculty: " + super.name;
    }
}
