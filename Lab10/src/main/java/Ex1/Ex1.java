/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;

/**
 *
 * @author Faith
 */
import java.io.*;

public class Ex1 {

    public static void main(String[] args) throws IOException {

//        File filetest = new File("C:\\Users\\Faith\\Documents\\NetBeansProjects\\Lab10\\ints.txt");
//
//        BufferedWriter bw = new BufferedWriter(new FileWriter(filetest));
//        for (int i = 0; i < 100; i++) {
//            bw.write((int) (Math.random() * 1000) + " ");
//        }
//
//            bw.close();

            File file = new File("C:\\Users\\Faith\\Documents\\NetBeansProjects\\Lab10\\binaryint.dat");

            DataOutputStream output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));

            for (int i = 0; i < 100; i++) {
                output.write((int) (Math.random() * 1000));
            }

            output.close();

//        DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
//
//        System.out.println(input.readInt());
//
//        int[] myArray = new int[100];
//        String line = input.readInt[];
//        String[] recArray = line.split(" ");
//
//        for (int i = 0; i < 100; i++) {
//            System.out.println("recArray[" + i + "]:" + recArray[i]);
//        }
//
//        input.close();
        }
    }
