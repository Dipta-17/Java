// 1. Write a Java Program to implement array of objects.
import java.io.*;
import java.util.*;

 class Book {
    private String title;
    private String author;
    private int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }


    void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
    }
}


public class A2_1 {
    public static void main(String[] args) {
    
        Book[] library = new Book[3];

        
        library[0] = new Book("Rich DaD poor dad", "Robert T.kiyosaki", 1997);
        library[1] = new Book("Power of your subconscious mind", "Dr.joseph murphy", 2020);
        library[2] = new Book("Atomic Habits", "James Clear", 1960);

    
        for (int i = 0; i < library.length; i++) {
            System.out.println("Book " + (i + 1) + ":");
            library[i].displayBookInfo();
            System.out.println();
        }
    }
    
}
