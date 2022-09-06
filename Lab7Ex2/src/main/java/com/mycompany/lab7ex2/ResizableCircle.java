/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7ex2;

/**
 *
 * @author Faith
 */
public class ResizableCircle extends Circle implements Resizable {

    // private double radius;
    ResizableCircle(double radius) {
        super(radius);
    }

    public int resize(int percent) {
        return 90;
    }

    public String toString() {
        return "Resizable Circle: " + this.radius;
    }
}
