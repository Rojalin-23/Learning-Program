package com.kodnest.methods.methodoverloading;

import java.util.Scanner;

public class Assingment {
    public static void main(String[] args) {
    	Scanner scan =new Scanner(System.in);
    	System.out.println("Enter Your Name");
    	String name =scan.next();
    	greet(name);
   }
    public static void greet(String name)
    {
    	System.out.println("Hello"+name+"How Are You....?");
    
    
    	
    }
    
    
}
