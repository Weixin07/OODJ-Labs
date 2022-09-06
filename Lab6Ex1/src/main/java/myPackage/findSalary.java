/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myPackage;
import java.util.*;
/**
 *
 * @author Faith
 */
public class findSalary {
    public static void main(String[] args) {

	FullTime fulltime = new FullTime();
	PartTime parttime = new PartTime();
	fulltime.calculateSalary();
	parttime.calculateSalary();
	
	MyDate date1 = new MyDate();
	MyDate date2 = new MyDate(34355555133101L);


	System.out.println("Fulltime Salary: " + fulltime.getSalary());
	System.out.println("Parttime Salary: " + parttime.getSalary());
	System.out.println("Fulltime Salary to String: " + fulltime.toString());
	System.out.println("Parttime Salary to String: " + parttime.toString());
	
	
	System.out.println("Date1 - Month: " + date1.getMonth() +
			" Day: " + date1.getDay() + " Year: " + date1.getYear());
	System.out.println("Date2 - Month: " + date2.getMonth() +
			" Day: " + date2.getDay() + " Year: " + date2.getYear());

}
}
