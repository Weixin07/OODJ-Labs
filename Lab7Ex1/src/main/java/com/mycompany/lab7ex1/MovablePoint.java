/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7ex1;

/**
 *
 * @author Faith
 */
public class MovablePoint implements Movable {

    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    MovablePoint() {

    }

    @Override
    public int moveUp() {
        return 5;
    }

    @Override
    public int moveDown() {
        return 6;
    }

    @Override
    public int moveLeft() {
        return 7;
    }

    @Override
    public int moveRight() {
        return 8;
    }

    public String toString() {
        return "x: " + this.x + ", y: " + this.y + ", xSpeed: " + this.xSpeed + ", ySpeed: " + this.ySpeed;
    }

}
