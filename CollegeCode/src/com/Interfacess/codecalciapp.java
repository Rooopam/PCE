package com.Interfacess;

import java.util.Scanner;

public class codecalciapp {
public static void main(String[] args) {
	
	duty(new Rupeshsoft());
	duty(new Anissoft());
	
   }
static void duty(kodcalci kc) {
	kc.add();
	kc.sub();
	kc.mul();
	kc.div();
	
}
}
  class Rupeshsoft implements kodcalci{
	  
public void add() {
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println(c);	
}
public void sub() {
	int a=10;
	int b=20;
	int c=a-b;
	System.out.println(c);
}
public void mul() {
	int a=10;
	int b=20;
	int c=a*b;
	System.out.println(c);
}
public void div() {
	int a=10;
	int b=20;
	int c=a/b;
	System.out.println(c);
}
}
  class Anissoft implements kodcalci {
	  Scanner s = new Scanner(System.in);

	    public void add() {
	        System.out.print("Enter two numbers for addition: ");
	        int a = s.nextInt();
	        int b = s.nextInt();
	        System.out.println("Addition: " + (a + b));
	    }

	    public void sub() {
	        System.out.print("Enter two numbers for subtraction: ");
	        int a = s.nextInt();
	        int b = s.nextInt();
	        System.out.println("Subtraction: " + (a - b));
	    }

	    public void mul() {
	        System.out.print("Enter two numbers for multiplication: ");
	        int a = s.nextInt();
	        int b = s.nextInt();
	        System.out.println("Multiplication: " + (a * b));
	    }

	    public void div() {
	        System.out.print("Enter two numbers for division: ");
	        int a = s.nextInt();
	        int b = s.nextInt();
	        if (b != 0) {
	            System.out.println("Division: " + (a / b));
	        } else {
	            System.out.println("Cannot divide by zero");
	        }
	    }
  }

  
  
  
  

  
  
  
  
  
  
  
  
  