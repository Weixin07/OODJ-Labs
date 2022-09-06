/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2;

/**
 *
 * @author Faith
 */
import java.io.*;

public class Ex2 {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\Faith\\Documents\\NetBeansProjects\\Lab10\\binaryint.dat");

        DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));

        for (int i = 0; i < 100; i++) {
            System.out.println(input.read());
            
        }

        input.close();

//        int[] myArray = new int[100];
//
//        for (int i = 0; i < myArray.length - 1; i++) {
//            
//        }

    }
}
