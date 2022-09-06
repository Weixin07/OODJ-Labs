package com.mycompany.lecture8;

import javax.swing.*;   // Needed for Swing classes

public class ShowWindow {

    {
        // Window width and height in pixels
        final int WINDOW_WIDTH = 500;
        final int WINDOW_HEIGHT = 350;
        JFrame window = new JFrame(); // Create a window      
        window.setTitle("A Simple Window"); // Set the title
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT); // Set the size of 						      //the window
        // Specify what happens when the close button is clicked
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel message = new JLabel("Enter a distance in kilometers");
        JTextField kilometers = new JTextField(10);
        JButton calcButton = new JButton("Calculate");
        JPanel panel = new JPanel();

        panel.add(message);
        panel.add(kilometers);
        panel.add(calcButton);
        window.add(panel);

        window.setVisible(true); // Display the window
    }
}
