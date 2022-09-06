/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partII;

/**
 *
 * @author Faith
 */
import java.io.*;

public class fileIO {

    public static void main(String[] args) throws IOException {
        //create an output stream to the file
        FileOutputStream output = new FileOutputStream("temp.dat");

        //output values to the file
        for (int i = 1; i <= 10; i++) {
            output.write(i);
        }//for 
        output.close();

        //create an input stream to the file
        FileInputStream input = new FileInputStream("temp.dat");

        //read values from the file
        int value;
        while ((value = input.read()) != -1) {
            System.out.print(value + " ");
        }//while
        input.close();
    }

}
