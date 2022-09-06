/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myPackage;

/**
 *
 * @author Faith
 */
public class Student extends Person {

//    Student(char name1, char address1, int phoneNumber1, char email1) {
//        super(name1, address1, phoneNumber1, email1);
//    }
//
//    char nameStudent;
//    char addressStudent;
//    int phoneNumberStudent;
//    char emailStudent;
    enum status {
        FRESHMAN,
        SOPHOMORE,
        JUNIOR,
        SENIOR
    }

    public static void main(String[] args) {
        Student student = new Student();
        status role = status.FRESHMAN;

        switch (role) {
            case FRESHMAN:
                System.out.println("Freshman");
                break;
            case SOPHOMORE:
                System.out.println("Sophomore");
                break;
            case JUNIOR:
                System.out.println("Junior");
                break;
            case SENIOR:
                System.out.println("Senior");
                break;
        }
    }
}
