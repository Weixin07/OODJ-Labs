/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lecture9;

/**
 *
 * @author Faith
 */
import java.io.*;

public class ReadMultiple {

    public static void main(String[] args) throws IOException {

        FileWriter output = new FileWriter("temp.txt");
        output.write("4 5 6");
        output.close();

        FileReader input = new FileReader("temp.txt");
        int code = input.read();
        while ((code = input.read()) != -1) {
            System.out.println((char) code);
        }
        input.close();
    }
}
