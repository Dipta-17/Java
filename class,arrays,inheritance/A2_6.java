// 6. WAP using parameterized constructor with two parameters id and name. While creating the objects obj1 and
import java.util.*;

class Student {
    private int id;
    private String name;


    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public void printData() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class A2_6 {
    public static void main(String[] args) {
        
        Student obj1 = new Student(1, "Dipta");
        Student obj2 = new Student(2, "Ankushi");

        System.out.println("Student 1 data:");
        obj1.printData();
        System.out.println();

        System.out.println("Student 2 data:");
        obj2.printData();
    }
}

