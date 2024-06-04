// 5. Write a program to create a class Student2 along with two method getData(),printData() to get the value
// through argument and display the data in printData. Create the two objects s1 ,s2 to declare and access the
// values from class STtest.
import java.io.*;
import java.util.*;

class Student2 {
    private String name;
    private int age;
    private String grade;

    public void getData(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    
    public void printData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

public class A2_5 {
    public static void main(String[] args) {
       
        Student2 s1 = new Student2();
        Student2 s2 = new Student2();

        
        s1.getData("Dipta", 24, "A");
        s2.getData("ankushi", 21, "B");

       
        System.out.println("Student 1 data:");
        s1.printData();
        System.out.println();

        System.out.println("Student 2 data:");
        s2.printData();
    }
}

