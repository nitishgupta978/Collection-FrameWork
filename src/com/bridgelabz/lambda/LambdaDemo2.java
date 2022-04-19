package com.bridgelabz.lambda;

interface hey{
	void sey(int i,String j);
}
interface Ran{
	void xyz(int k,int s);

}
public class LambdaDemo2 {
	public static void main(String[] args) {
		hey obj;
		Ran obj1;
		obj1=(k,s)->System.out.println(Integer.toString(s)+ " "+Integer.toString(k) );
		obj = ( i, j)->System.out.println(i +j );
		obj.sey(10, " john");
		obj1.xyz(10, 50);
	}
	
}