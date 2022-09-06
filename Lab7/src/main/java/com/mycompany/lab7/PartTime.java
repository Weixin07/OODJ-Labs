/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

/**
 *
 * @author Faith
 */
public class PartTime extends Employee implements Payable {

    int calculateWorkload() {
        return 6;
    }

    public int calculateSalary() {
        return 6 * 200; //Hours worked per week * Rate
    }
}
