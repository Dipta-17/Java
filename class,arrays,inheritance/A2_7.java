// 7. Write a program in java to generate an abstract class A also class B inherits the class A. generate the object for
// class B and display the text “call me from B”.
import java.io.*;
import java.util.*;

abstract class A {
    
    public abstract void display();
}

class B extends A {
    
    @Override
    public void display() {
        System.out.println("call me from B");
    }
}

public class A2_7 {
    public static void main(String[] args) {

        B obj = new B();
        
        obj.display();
    }
}
