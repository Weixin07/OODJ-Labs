/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Faith
 */
public class testRectangle {
    public static void main(String[] args){
    Rectangle r1 = new Rectangle(5,50,"Yellow");
     //Static means like a master variable:
     // For eg, today, A is master, B and C inherited
     // If we change A, B and C's variable will also change, that is because this is a static variable
    System.out.println("WIdth: " + r1.getWidth());
    System.out.println("Height: " + r1.getHeight());
    System.out.println("Colour:" + r1.getColour());
        
    System.out.println("Perimeter: " + r1.getWidth()*2+r1.getHeight()*2);
    System.out.println("Area: " + r1.getWidth()*r1.getHeight());
    
    Rectangle r2 = new Rectangle(5,50,"Yellow");

    System.out.println("WIdth: " + r2.getWidth());
    System.out.println("Height: " + r2.getHeight());
    System.out.println("Colour:" + r2.getColour());
        
    System.out.println("Perimeter: " + r2.getWidth()*2+r2.getHeight()*2);
    System.out.println("Area: " + r2.getWidth()*r2.getHeight());
    }
}
