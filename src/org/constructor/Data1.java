package org.constructor;

public class Data1 {
	public Data1() {
	this(45887f,987654321l);
		System.out.println("-------------");
	}
	public Data1(int id) {
		this("Senthil");
		System.out.println("Employee id is:"+id);
		
	}
	public Data1(String name) {
		System.out.println("Employee name is:"+name);
		
	}
	public Data1(Float salary,long phno) {
		this(101);
		System.out.println("Employe salary  is :"+salary);
		System.out.println("Employee phno is: "+phno);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data1 d = new Data1();

	}

}
