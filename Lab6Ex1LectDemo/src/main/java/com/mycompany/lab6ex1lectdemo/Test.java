/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6ex1lectdemo;

import static com.mycompany.lab6ex1lectdemo.Status.*;

/**
 *
 * @author Faith
 */
public class Test {

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "emp 1";
        System.out.println(emp.toString());

        Student std = new Student(SENIOR);
        std.name = "std 1";
        System.out.println(std.toString());

        Faculty fac = new Faculty();
        fac.name = "fac 1";
        System.out.println(fac.toString());

        Staff stf = new Staff();
        stf.name = "Stf 1";
        System.out.println(stf.toString());

        FullTime ft = new FullTime();
        ft.name = "ft 1";
        System.out.println(ft.toString());
        PartTime pt = new PartTime();
        pt.name = "pt 1";
        System.out.println(pt.toString());

        emp.toString();
        std.toString();
        fac.toString();
        stf.toString();
        ft.toString();
        pt.toString();
    }
}
