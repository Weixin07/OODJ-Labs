/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

/**
 *
 * @author Faith
 */
public class Test {

    public static void main(String[] args) {
        Employee emp = new FullTime(); //Using superclass to point to subclass. And using subclass to create the object.
        emp.name = "Sussy Baka";
        System.out.println("Name: " + emp.name);
        //System.out.println(emp.workload); //Can't be accessed cuz the pointer can only get the attributes that they (super and sub) both have
        System.out.println("Workload: " + emp.calculateWorkload());
        //These 2 attributes name and calculateWorkload is common between Employee and FullTime class. Thus, these 2 can be accessed.

        FullTime ft = new FullTime();
        System.out.println("Name: " + ft.name);
        System.out.println("Workload: " + ft.workload);
        System.out.println("Salary: " + ft.calculateSalary());

        PartTime pt = new PartTime();
        System.out.println("Name: " + pt.name);
        System.out.println("Workload: " + pt.calculateWorkload());
        System.out.println("Salary: " + pt.calculateSalary());

        Assistant as = new Assistant();
        System.out.println("Name: " + as.name);
        System.out.println("Workload: " + as.calculateWorkload());
        System.out.println("Salary: " + as.calculateSalary());

    }
}
