package com.bridgelabz.lambda;

interface Abc{
	void show(int i);
}
//abstract class xyz implements A{//interface not have a body so we can access with implements &provide body
//
//	public void show() {
//	System.out.println("Hello");
//	}
//}

public class LambdaDemo {
	public static void main(String[] args) {
	
	Abc obj;
//		//   //without lambda,Abc implementation using anonymous class  
//	obj = new Abc() {
//			
//		public void show(int i)
//		{
//			System.out.println("print "+i);}
//		};
//		
//obj.show(6);
	
	// with Lambda Functional Interface
		obj=(int i)->System.out.println(i);
		obj.show(6);
		
		obj=i->System.out.println(i);// only one parameter than its applicable
		obj.show(10);
	}
}