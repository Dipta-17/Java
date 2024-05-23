//3. Write Java program to print Biggest of 3 Numbers using Logical Operators.

import java.util.*;
import java.io.*;
class big
{
      void fn()
      {
         int a,b,c;
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter the value of a:");
         a=sc.nextInt();
         System.out.print("Enter the value of b:");
         b=sc.nextInt();
         System.out.print("Enter the value of c:");
         c=sc.nextInt();

      if (a>b && a>c)
          System.out.print("a is the biggest");
      else if(b>a && b>c)
          System.out.print("b is the biggest");
      else
          System.out.print("c is the biggest");

     }

}
class biggest
{
     public static void main(String args[])
     {
           big ref=new big();
           ref.fn();



     }





}