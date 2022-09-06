/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7ex2;

/**
 *
 * @author Faith
 */
public class Circle implements GeometricObject {

    protected double radius = 1.0;

    Circle(double radius1) {
        radius = radius1;
    }

    @Override
    public double getPerimeter() {
        return 40;
    }

    @Override
    public double getArea() {
        return 80;
    }

}
