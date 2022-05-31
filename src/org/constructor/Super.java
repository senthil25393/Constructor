package org.constructor;

public class Super {
	public Super() {
		System.out.println("parent default constructor");
	}
	
	public Super(int a) {
		this();
		System.out.println("Parent Int pata constructor");
		System.out.println(a);
	}

}
