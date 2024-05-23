//7.Write a java program to print sum of n terms in the series 1/1! +1/2!+1/3!.....


import java.io.*;
import java.util.*;
class seri{
 void fn(){
  int n;
  double f=1,s=0;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the numbers:");
  n=sc.nextInt();
  for(int i=1;i<=n;i++)
   {
     f=f*i;
     s=s+(1.0/f);
   }
   System.out.println(s);
}
}

class seri1{
public static void main(String args[]){
 seri obj = new seri();
 obj.fn();
}

}




