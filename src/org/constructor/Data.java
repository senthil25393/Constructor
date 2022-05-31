package org.constructor;

public class Data {

	public Data() {
		// TODO Auto-generated constructor stub
		this(101);
		System.out.println("Employee Details");
	}
	
	public Data(int a) {
		this("Senthil");
		System.out.println("Employee id is :"+a);
		
	}
	public Data(String name) {
		System.out.println("Employee name is :"+name);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new Data();

	}

}
