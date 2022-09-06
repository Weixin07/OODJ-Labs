/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7ex1demo;

/**
 *
 * @author Faith
 */
public class MovableCircle implements Movable {

    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        System.out.println("Moving Up");
    }

    @Override
    public void moveDown() {
        System.out.println("Moving Down");
    }

    @Override
    public void moveLeft() {
        System.out.println("Moving Left");
    }

    @Override
    public void moveRight() {
        System.out.println("Moving Right");
    }

    @Override
    public String toString() {
        return "Movable Circle:" + radius + "," + center;
    }
}
