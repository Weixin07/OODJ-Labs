package com.mycompany.lab6ex1lectdemo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Faith
 */
public class Student extends Person {

    private final Status status;

    public Student(Status status) {
        this.status = status;
    }
    
        @Override
    public String toString() {
        return "Student: " + this.name + ", Status: " + this.status;
    }
}
