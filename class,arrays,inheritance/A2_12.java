// 12. Write a JAVA Program to demonstrate Constructor overloading and Method overloading.
import java.io.*;
import java.util.*;

// Class with constructor and method overloading
class Overload {
    private int num;

    // Constructor overloading
    public Overload() {
        num = 0; 
    }

    public Overload(int num) {
        this.num = num;
    }

    // Method overloading
    public void display() {
        System.out.println("Value of num: " + num);
    }

    public void display(String message) {
        System.out.println(message + " " + num);
    }

    public void display(int value) {
        System.out.println("Value: " + value);
    }
}


public class A2_12 {
    public static void main(String[] args) {
     
        Overload obj1 = new Overload(); 
        Overload obj2 = new Overload(80); 

       
        obj1.display(); 
        obj2.display(); 
        obj2.display("Number:"); 
        obj2.display(35); 
    }
}














 