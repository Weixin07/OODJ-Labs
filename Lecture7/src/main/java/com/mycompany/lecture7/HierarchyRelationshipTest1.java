/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lecture7;

/**
 *
 * @author Faith
 */
// HierarchyRelationshipTest1.java
// Assigning superclass and subclass references to superclass- and
// subclass-type variables
import javax.swing.JOptionPane;

public class HierarchyRelationshipTest1 {

    public static void main(String[] args) {
// assign superclass reference to superclass-type variable
        Point point = new Point(30, 50);

// assign subclass reference to subclass-type variable
        Circle circle = new Circle(120, 89, 2.7);

// invoke toString on superclass object using superclass variable
        String output = "Call Point's toString with superclass"
                + " reference to superclass object: \n" + point.toString();

// invoke toString on subclass object using subclass variable
        output += "\n\nCall Circle's toString with subclass"
                + " reference to subclass object: \n" + circle.toString();

// invoke toString on subclass object using superclass variable
        Point pointRef = circle;

        output += "\n\nCall Circle's toString with superclass"
                + " reference to subclass object: \n" + pointRef.toString();

        JOptionPane.showMessageDialog(null, output);  // display output

        System.exit(0);

    } // end main

} // end class HierarchyRelationshipTest1

