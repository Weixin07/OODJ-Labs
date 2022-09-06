/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7ex1demo;

/**
 *
 * @author Faith
 */
public class MovableTest {

    public static void main(String[] args) {
        MovablePoint mp = new MovablePoint(1, 2, 5, 6);
        MovableCircle mc = new MovableCircle(10, 20, 5, 10, 50);

        System.out.println("Movable Point:" + mp.toString());
        System.out.println("Movable Circle:" + mc.toString());
        mp.moveDown();
        mp.moveUp();
    }
}
