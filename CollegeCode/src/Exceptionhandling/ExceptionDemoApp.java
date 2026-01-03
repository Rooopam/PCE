package Exceptionhandling;
import java.util.Scanner;
public class ExceptionDemoApp {
	public static void main(String[] args) {
		System.out.println("connection is established");
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter value 1:");
		int a= sc.nextInt();
		System.out.println("pease enter the value 2:");
		int b=sc.nextInt();
		try {
		int c=a/b;
	
		System.out.println(c);
		} catch (Exception e) {
			System.out.println("exception handled ");
		}
		
		System.out.println("connnection is terminated.");
		
		
	}

}
