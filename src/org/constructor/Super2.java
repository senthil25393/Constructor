package org.constructor;

public class Super2 extends Super {
	public Super2() {
		super(68);
		System.out.println("Child default constructor");
		
	}
	public Super2(int b) {
		
		System.out.println("Child int para constructor");
		System.out.println(b);
		
	}

	
	public static void main(String[] args) {
	
		Super2 s = new Super2();
	}

}
