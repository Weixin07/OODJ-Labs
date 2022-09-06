/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

/**
 *
 * @author Faith
 */
public class FullTime extends Employee implements Payable {

    protected int workload;

    int calculateWorkload() {
        return 40;
    }

    public int calculateSalary() {
        return 8000;
    }
}
