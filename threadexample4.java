//6. Write a program to implement the concept of threading by implementing Runnable Interface
// Creating a Java Thread Using Runnable Interface

import java.io.*;
import java.util.*;


class mythreadrunnable1 implements Runnable{
    public void run (){
        System.out.println("myself dipta--thread1");
        System.out.println("myself dipta--thread1");
        System.out.println("myself dipta--thread1");
        System.out.println("myself dipta--thread1");       

    }
}
class mythreadrunnable2 implements Runnable{
    public void run(){
        System.out.println("this is thread2");
        System.out.println("this is thread2");
        System.out.println("this is thread2");
        System.out.println("this is thread2");

    }

}


public class threadexample4 {
    public static void main(String[] args) {
        mythreadrunnable1 obj1=new mythreadrunnable1();
        Thread r=new Thread(obj1);
        r.start();
        mythreadrunnable2 obj2=new mythreadrunnable2();
        Thread r1=new Thread(obj2);
        r1.start();
    
    
    
    
    }   
    
}
