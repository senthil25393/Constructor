package org.constructor;

public class Client extends Sampl {
	
	public Client() {
		super(68);
		// TODO Auto-generated constructor stub
		System.out.println("Child Default constructor");
	}

	public Client(int idno)
	{
	
		System.out.println("Child Integer Para Constructor");
		System.out.println(idno);
	}
	
	public static void main(String[] args) {
		
		Client c = new Client();
		
	}
}
