//Write a java program to print Factorial of a given number using recursion.

import java.io.*;
import java.util.*;


class fact{
    int fac( int n){
     if(n==1)
        return 1;
      else
        return n*fac(n-1);

}
}

class fact_rec{
public static void main(String args[]){
     int n;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number:");
     n=sc.nextInt();
     fact obj=new fact();
     int fact1=obj.fac(n);
     System.out.println("Factorial of " + n + " is: " + fact1);
    }
}
