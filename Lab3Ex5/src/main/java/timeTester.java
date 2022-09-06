/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Faith
 */
public class timeTester {
    public static void main(String[] args) throws Exception{
        //basically creating a reference for a time object, and placing it 
        Time[] times = new Time[5];
    
    for (int i = 0; i < times.length; i++){
    times[i] = new Time();
    //To print out the time object saved within
    System.out.println(times[i]);
    
    //Thread.sleep is to stop the loop for 5 seconds
    Thread.sleep(5000);
    }
    
    //Difference is: Up is print then wait then print
    //DOwn is run once, saved in memory, then print all at once
    
    //Another method to print out the time object saved within
    for (Time t : times){
    System.out.println(t);
    }
            }
}
