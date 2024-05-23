//Write a java program to print first 10 numbers in Fibonacci series. Also print their sum.

import java.util.*;
import java.io.*;
class fibo
{
     void main()
     {
        int a=0,b=1,c,temp,i,s=0;
        Scanner sc=new Scanner(System.in);
        for (i=1;i<=10;i++)
          {
             
		c=a+b;
		a=b;
                b=c;
                System.out.print(c+" ");
		s=s+c;
               

	}
       System.out.print("The sum of of the fibonacci series is"+" "+s);

     }

}
class fibonacci
{
public static void main(String args[])
   	{
             fibo ref=new fibo();
	     ref.main();

	}





}