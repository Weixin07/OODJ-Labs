/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab9lectdemo;

/**
 *
 * @author Faith
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ioDemo {

    public static void main(String[] args) {
        int[] myArray = new int[100];
        for (int i = 0; i < 100; i++) {
            myArray[i] = (int) (Math.random() * 1000);

        }

        File file = new File("C:\\Users\\Faith\\Documents\\NetBeansProjects\\Lab9LectDemo\\tmp.txt");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < 100; i++) {
                bw.write("" + myArray[i] + "\n");
            }
            bw.close();
        } catch (Exception ex) {
            Logger.getLogger(ioDemo.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String rec = "";
            while ((rec = br.readLine()) != null) {
                System.out.println("Data: " + rec);
            }
        } catch (Exception ex) {
            Logger.getLogger(ioDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("End of Programme");
    }
}
