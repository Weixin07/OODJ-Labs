/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7ex1;

/**
 *
 * @author Faith
 */
public class Test {

    public static void main(String[] args) {
        MovablePoint mp = new MovablePoint();
        mp.x = 1;
        mp.y = 2;
        mp.xSpeed = 3;
        mp.ySpeed = 4;
        System.out.println("X: " + mp.x);
        System.out.println("Y: " + mp.y);
        System.out.println("X Speed: " + mp.xSpeed);
        System.out.println("Y Speed: " + mp.ySpeed);
        System.out.println("Move Up: " + mp.moveUp());
        System.out.println("Move Down: " + mp.moveDown());
        System.out.println("Move Left: " + mp.moveLeft());
        System.out.println("Move Right: " + mp.moveRight());
        System.out.println("Entire: " + mp.toString());

        MovableCircle mc = new MovableCircle();
        mc.radius = 10;
        System.out.println("Radius: " + mc.radius);
        System.out.println("Entire: " + mc.toString());

    }
}
