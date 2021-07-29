package com.javaproject;

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism dinive=new Polymorphism();
	
		dinive.car();
		dinive.car(1, 'c');
		
	}
	public void car() {
		System.out.println("dinive acting"); 
		
	}
		public void car(int no,char c) {
			System.out.println("lol");
			
		
}

}