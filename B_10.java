//10. Write a Java Program to define a class, describe its constructor, overload the Constructors and instantiate its object
import java.io.*;
import java.util.*;
import java.lang.*;

class A {
    int a;
    double b;
    String c;

    // Default constructor
    A() {
        a = 100;
        b = 45.32;
        c = "dipta";
    }

    // Constructor with one int parameter
    A(int x) {
        a = x;
        b = 0.0; // Default value for double
        c = "";  // Default value for String
    }

    // Constructor with one double and one String parameter
    A(double y, String z) {
        a = 0;  // Default value for int
        b = y;
        c = z;
    }
}

public class B_10 {
    public static void main(String args[]) {
        A r = new A();
        A r2 = new A(10);
        A r3 = new A(23.88, "dipta");

        System.out.println(r.a + " " + r.b + " " + r.c);
        System.out.println(r2.a + " " + r2.b + " " + r2.c);
        System.out.println(r3.a + " " + r3.b + " " + r3.c);
    }
}

