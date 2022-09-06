/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lecture7;

/**
 *
 * @author Faith
 */
public abstract class Shape extends Object {

// return area of shape; 0.0 by default
    public double getArea() {
        return 0.0;
    }

// return volume of shape; 0.0 by default
    public double getVolume() {
        return 0.0;
    }

// abstract method, overridden by subclasses
    public abstract String getName();

} // end abstract class Shape

