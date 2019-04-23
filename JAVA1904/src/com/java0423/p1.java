package com.java0423;

public class p1 {

	
	public p1 () {
		
		new p2("객체가 머냐?");
	}
	public p1 (String msg) {
		System.out.println("p2: "+msg);
		new p2();
	}
	
	static void say(String msg) {
		System.out.println("p1: "+msg);
	}
}
