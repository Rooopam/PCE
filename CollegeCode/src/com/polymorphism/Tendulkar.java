package com.polymorphism;

public class Tendulkar {
	public static void main(String[]args) {
		SachinTendulkar t=new ArjunTendulkar();
		t.job();
		t.profession();
		((ArjunTendulkar)t).smoke();
		
	}

}
class SachinTendulkar{
	void job() {
		System.out.println("play cricket");
	}
	void profession() {
		System.out.println("Batsman");
	}
}
class ArjunTendulkar extends SachinTendulkar{
	void profession() {
		System.out.println("Bowler");
	}
	void smoke() {
		System.out.println("he smokes sometimes");
	}
 }
//limitation as smoke is not defined in Sachin tendulkar