package com.polymorphism;

public class ParentApp1 {
	public static void main(String[] args) {
		ChildA c=new ChildA();
		c.disp();
	}

}
class ParentA{
	void disp() {
		System.out.println("this is a parent method");
	}
}
class ChildA extends ParentA{
	protected void disp() {
		System.out.println("this is child method");
	}
}
