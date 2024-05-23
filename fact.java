//Write a Java program that calculates factorial of a number.

import java.util.*;
import java.io.*;
class factorial
{
        void fn(){
	int i,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        n=sc.nextInt();
        int s=1;
        for(i=1;i<=n;i++)
        {

             s=s*i;

        }
        System.out.print("The factorial of this number is:"+ s);

        }
                

}
class fact
{
        public static void main(String args[])
	{
      		factorial  ref=new factorial();
      		ref.fn();



	}
}

