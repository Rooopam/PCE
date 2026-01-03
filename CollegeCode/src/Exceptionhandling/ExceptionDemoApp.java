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
		
		System.out.println("please enter the size of an array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Please enter index no. arr");
		int aa = sc.nextInt();
		
		arr[aa]=999;
		
		
		} catch(ArithmeticException e) {
			
			System.out.println("Divide by zero is not allowed ");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("pls define the index no. within a range");
		}
		catch (NegativeArraySizeException e) {
			System.out.println("pls define the positive size of array");
		}
		
		System.out.println("connnection is terminated.");
		
		
	}

}
