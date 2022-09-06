/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Faith
 */
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
    
    //this is the constructor
    public Time(){
    Calendar cal = GregorianCalendar.getInstance();
    cal.setTimeInMillis(System.currentTimeMillis());
    this.hour = cal.get(GregorianCalendar.HOUR);
    this.minute = cal.get(GregorianCalendar.MINUTE);
    this.second = cal.get(GregorianCalendar.SECOND);
    }
    
    @Override
    public String toString(){
        return hour + ":" + minute + ":" + second;
    }
}

