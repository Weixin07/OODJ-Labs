/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab9lectdemo;

/**
 *
 * @author Faith
 */
public class exceptionDemo {

    public static void main(String[] args) {
        int[] myArray = new int[100];
        for (int i = 0; i < 100; i++) {
            myArray[i] = (int) (Math.random() * 1000);

        }

        try {
            for (int i = 0; i < 101; i++) {
                System.out.println("MyArray[" + i + "]: " + myArray[i]);
                //For the first catch block
                System.out.println("Division by 0" + 50 / 0);
                //For the commented catch block
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bound");
        } 
        //catch (ArithmeticException ex2) {
        //  System.out.println("Math Error");
        //}
        catch (Exception ex) {
            //For all exceptions
            System.out.println("Error:" + ex.getMessage());
        }
        System.out.println("End of Programme");
    }
}
