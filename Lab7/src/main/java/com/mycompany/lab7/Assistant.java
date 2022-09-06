/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

/**
 *
 * @author Faith
 */
public class Assistant extends Employee implements Payable {

    @Override
    int calculateWorkload() {
        return 2;
    }

    @Override
    public int calculateSalary() {
        return 0; //Evil boss sia 0 salary
    }

}
