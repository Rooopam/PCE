package Exceptionhandling;
import java.util.Scanner;


public class BankApp {

	public static void main(String[] args) {
		Atm a=new Atm();
		a.acceptInfo();
		a.verify();
	}

}
class Atm {
	int acc_no=123456;
	int pass=124;
	int u_acc;
	int u_pass;
	void acceptInfo() {
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter your acc number;");
		u_acc=sc.nextInt();
		System.out.println("please enter your pass");
		u_pass=sc.nextInt();
		
	}
	void verify() {
		if(acc_no==u_acc && pass== u_pass) {
			System.out.println("collect your cash");
			
		}else {
			System.out.println("Access denied");
		}
		
	}
}
