/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myPackage;

//import java.util.Date;
//import java.time.Month;
//import java.time.LocalDate;
import java.util.*;
/**
 *
 * @author Faith
 */
public class Employee extends Person {
//    Employee(char name1, char address1, int phoneNumber1, char email1) {
//        super(name1, address1, phoneNumber1, email1);
//    }
//
//    char nameEmployee;
//    char addressEmployee;
//    int phoneNumberEmployee;
//    char emailEmployee;
//    
    private String office;
    public double salary;
    private MyDate dateHired;
    
    
//    
//    
//    public static void getDate(String date){
//        LocalDate currentDate = LocalDate.parse(date);
//
//        int day = currentDate.getDayOfMonth();
//        Month month = currentDate.getMonth();
//        int year = currentDate.getYear();
//    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
