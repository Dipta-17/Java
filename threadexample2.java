// 5. Write a program to implement the concept of threading by extending Thread Class
import java.io.*;
import java.util.*;


class threadexample2 extends Thread{
    public void run(){
        System.out.println("i am dipta");
        System.out.println("I am a mca student");
   }

    public static void main(String args[]){
        threadexample2 obj1=new threadexample2();
        obj1.start();
        threadexample2 obj2=new threadexample2();
        obj2.start();
    }


}

