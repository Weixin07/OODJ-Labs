/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lecture8;

/**
 *
 * @author Faith
 */
import javax.swing.*;   // Needed for Swing classes

public class SimpleWindow extends JFrame {

    /* Constructor */
    public SimpleWindow() {

        final int WINDOW_WIDTH = 800;   // Window width in pixels
        final int WINDOW_HEIGHT = 550;  // Window height in pixels

        setTitle("A Simple Window"); // Set this window's title
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT); // Set the size of 						//this window
        // Specify what happens when the close button is clicked.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true); // Display the window

    }

    public static void main(String[] args) {
        new SimpleWindow();
    }
}
