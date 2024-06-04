//3. Write a Java Program to find the largest and smallest element from an array.
import java.io.*;
import java.util.*;
class A2{
       void fn(int arr[]){
        if (arr==null || arr.length==0)
        {
                System.out.println("the is empty");
        }
        int l=arr[0];
        int s=arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]>l){
                l=arr[i];
            }
            if (arr[i]<s){
                s=arr[i];
            }
        }
        System.out.println("the lergest value:"+l);
        System.out.println("the smallest value:"+s);
       }
}
public class A2_3 {
    public static void main(String[] args) {
        int arr[]={56,78,34,64,12};
        A2 r=new A2();
        r.fn(arr);
    }    
}