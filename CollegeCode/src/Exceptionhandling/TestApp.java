package Exceptionhandling;

import java.util.Scanner;

public class TestApp {
	public static void main(String[] args) {
	}
}

class Test1{
	void alpha() {
		System.out.println("Connection 1 stablish");
		Test2 t2= new Test2() {
			t2.beta();
			System.out.println("Condition 1 Terminate");
		}
	}
}

class Test2{
	void beta() {
		System.out.println("Connection 2 estabblish");
		Test3 t3= new Test3() {
			t3.gamma();
			System.out.println("Codition 2 terminate");
		}
	}
}
  class Test3 {
	  void gamma() {
		  System.out.println("connection 3 is Established");
		  Scanner sc = new Scanner   
		  Test1 t1=new Test1
	  }
  }
