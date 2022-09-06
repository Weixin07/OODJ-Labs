/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Faith
 */
public class timeTester {
    public static void main(String[] args){
    Time now = new Time();
    //Method 1
    System.out.println(now.getHour() + ":" + now.getMinute() + ":" + now.getSecond());
    //Method 2
    System.out.println(now.toString());
    }
}
