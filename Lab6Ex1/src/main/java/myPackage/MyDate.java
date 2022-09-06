/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myPackage;

/**
 *
 * @author Faith
 */
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {
    private int day;
    private int month;
    private int year;

    MyDate(long l) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    
    //this is the constructor
    public MyDate(){
    Calendar cal = GregorianCalendar.getInstance();
    this.day = cal.get(GregorianCalendar.DAY_OF_MONTH);
    this.month = cal.get(GregorianCalendar.MONTH);
    this.year = cal.get(GregorianCalendar.YEAR);
    }
    
    @Override
    public String toString(){
        return day + "-" + month + "-" + year;
    }
}