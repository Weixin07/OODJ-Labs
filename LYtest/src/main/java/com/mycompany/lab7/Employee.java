/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

import java.util.Scanner;

/**
 *
 * @author Faith
 */
public class Employee {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scan.nextLine();

        System.out.print("Age: ");
        int age = scan.nextInt();

        System.out.print("Height: ");
        int height = scan.nextInt();

        System.out.println("The employee's details are:");
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Height:" + height);

    }

}
