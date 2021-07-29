package com.javaproject;

public class Constructor {

	int a;
	int b;
	int c;
	
	
public Constructor() {
	
	System.out.println("Hi mama");
	
}

public Constructor(int c,int d) {
	this.a=1;
	this.b=3;
	System.out.println(+this.a  +this.b);//calling object twice
}
	public Constructor(int a,int b,int c) {

		this.a=1;
		this.b=4;
		this.c=6;
		System.out.println(+this.a +this.b +this.c);


}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Constructor jj=new Constructor();
		Constructor kk=new Constructor(6,7);
System.out.println(+kk.a  +kk.b);//calling object twice
Constructor cc=new Constructor(0,2,4);


		}}


