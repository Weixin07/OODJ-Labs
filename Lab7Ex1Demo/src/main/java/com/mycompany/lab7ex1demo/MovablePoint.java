/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7ex1demo;

/**
 *
 * @author Faith
 */
public class MovablePoint implements Movable {

    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
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
        return "Movable Point" + x + "," + y + "," + xSpeed + "," + ySpeed;
    }

}
