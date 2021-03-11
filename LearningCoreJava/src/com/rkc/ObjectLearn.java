package com.rkc;
class Calc
{
	int num1;
	int num2;
	int result;
	
	public Calc()
	{
		num1 =5;
		num2 = 5;
		System.out.println("We are in the 1st Constructor");
	}
	
	public Calc(int n)
	{
		num1 = n;
		num2 = n;
		System.out.println("We are in the 2nd Constructor");
	}
	
	public Calc(double d)
	{
		num1 = (int)d;
		num2 = (int)d;
		System.out.println("We are in the 3rd Constructor");
	}
	
	/*public Calc(int number1, int number2)
	{
		num1 = number1;
		num2 = number2;
		System.out.println("We are in the 4th Constructor");
	}*/
	
	public Calc(int num1, int num2)
	{
		this.num1 = num1; //current object
		this.num2 = num2;
		System.out.println("We are in the 5th Constructor");
	}
}

public class ObjectLearn {
	public static void main(String[] args)
	{
		//Calc obj = new Calc();
		//Calc obj = new Calc(7);
		//Calc obj = new Calc(7.5); // reference - Object Knows something and does Something
		Calc obj = new Calc(4,5);
		
		System.out.println(obj.num1);
		System.out.println(obj.num2);
		
	}


}
