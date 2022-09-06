/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lecture9;

import java.io.*;



/**
 *
 * @author Faith
 */
public class BW {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("temp2.txt",true));

        bw.write("3 4 5");
        bw.close();

        FileReader input = new FileReader("temp2.txt");
        int code = input.read();
        System.out.println((char) code);
        input.close();
    }
}
