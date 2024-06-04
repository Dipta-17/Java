//2. Write a Java Program to implement bubble sort .
import java.io.*;
import java.util.*;
public class A2_2 {
    public static void main(String[] args) {
        int array[]={10, 43, 120 ,15};
        // int len=array.length();
        int temp;
        for(int i=0;i<=array.length-1;i++){
            for (int j=0;j<array.length-i-1;j++){
                     if (array [j]> array[j+1]){
                        temp=array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;
                     }
            }
        }
        System.out.println("the sorted array is:"+Arrays.toString(array));
    }    
}
