/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex3;

/**
 *
 * @author Faith
 */
import java.io.*;
import java.util.logging.*;
import java.util.*;

public class Ex3 {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\Faith\\Documents\\NetBeansProjects\\Lab9LectDemo\\ints.txt");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < 100; i++) {
                bw.write((int) (Math.random() * 1000) + " ");
            }
            bw.close();

            Scanner input = new Scanner(file);
            int[] myArray = new int[100];
            String line = input.nextLine();
            String[] recArray = line.split(" ");

            for (int i = 0; i < 100; i++) {
                // System.out.println("recArray[" + i + "]:" + recArray[i]);
                myArray[i] = Integer.parseInt(recArray[i]);
            }
            //System.out.println("The output: " + line);

            for (int i = 0; i < myArray.length - 1; i++) {
                for (int j = i + 1; j < myArray.length; j++) {
                    if (myArray[i] > myArray[j]) {
                        int temp = myArray[i];
                        myArray[i] = myArray[j];
                        myArray[j] = temp;
                    }
                }
            }

            for (int i = 0; i < myArray.length; i++) {
                System.out.println("myArray[" + i + "]: " + myArray[i]);
            }

        } catch (Exception ex) {
            Logger.getLogger(Ex3.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
