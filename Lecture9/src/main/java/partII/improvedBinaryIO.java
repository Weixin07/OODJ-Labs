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

public class improvedBinaryIO {
        public static void main(String[] args) throws IOException {
        //create an output stream for the file temp.dat
        DataOutputStream output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("temp.dat")));

        //write student test scores
        output.writeUTF("John");
        output.writeDouble(86.5);
        output.writeUTF("Jim");
        output.writeDouble(95.5);
        output.writeUTF("George");
        output.writeDouble(100.0);
        //close output stream
        output.close();

        //create an input stream for file temp.dat
        DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream("temp.dat")));
        //read student test scores
        System.out.println(input.readUTF() + " " + input.readDouble());
        System.out.println(input.readUTF() + " " + input.readDouble());
        System.out.println(input.readUTF() + " " + input.readDouble());
        input.close();
    }

}
