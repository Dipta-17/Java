// 8. Write a java program in which you will declare two interface sum and Add inherits these interface through
// class A1 and display their content.
import java.io.*;
import java.util.*;

interface Sum {
    void displaySum();
}
interface Add {
    void displayAdd();
}
class A1 implements Sum, Add {
    private int num1;
    private int num2;
    public A1(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    } 
    @Override
    public void displaySum() {
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
    } 
    @Override
    public void displayAdd() {
        System.out.println("Addition of " + num1 + " and " + num2 + " gives " + (num1 + num2));
    }
}
public class A2_8 {
    public static void main(String[] args) {
      
        A1 obj = new A1(5, 3);   
        obj.displaySum();
        obj.displayAdd();
    }
}
