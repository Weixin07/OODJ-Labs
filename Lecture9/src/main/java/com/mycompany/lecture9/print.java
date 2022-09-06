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
import java.util.*;

public class print {

    public static void main(String[] args) throws IOException {
        //check if file temp.txt already exits
        File f = new File("temp.txt");
        if (f.exists()) {
            System.out.println("File temp.txt already exist.");
            System.exit(0);
        }

        //create an output stream
        PrintWriter output = new PrintWriter(new FileWriter(f));

        //generate ten integers and write them to a file
        for (int i = 0; i < 10; i++) {
            output.print((int) (Math.random() * 100) + " ");
        }
        output.close();

//open an input stream
        BufferedReader input = new BufferedReader(new FileReader("temp.txt"));
        int total = 0;
        String line;
        while ((line = input.readLine()) != null) {
            //extract numbers using string tokenizer
            StringTokenizer tokens = new StringTokenizer(line);

            while (tokens.hasMoreTokens()) {
                total += Integer.parseInt(tokens.nextToken());
            }//while
        }//while

        System.out.println("Total is " + total);

        input.close();
    }

}
