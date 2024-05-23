//2. Write a program to swap two values using object reference. Your program should have a swap method.

import java.util.*;
import java.io.*;
class sw
{
      void fn()
      {
	int a,b,temp;
 	Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        a=sc.nextInt();
        System.out.print("Enter the value of b:");
        b=sc.nextInt();
        

	temp=a;
        a=b;
        b=temp;
        System.out.print("After swaping the value of a & b are"+a+" "+b);


      }	

}
class swap
{
	public static void main(String args[])
        {
             sw ref=new sw();
	     ref.fn();



        }


}