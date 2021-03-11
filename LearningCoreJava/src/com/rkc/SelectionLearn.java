package com.rkc;

public class SelectionLearn {
	public static void main(String[] args)
	{
		int n = 1;
		
		if (n==0)
		{
			System.out.println("Nothing");
			System.out.println("bye");
		}
		else
			if (n % 2 == 0)
				System.out.println("Even");
			else		
				System.out.println("Odd");
		
		//ternary operator
		//?: - >condition?expr1:expr2
		int i = 8; 
		int j = 0;
		
		/*
		 * if(i>6) j =1; else j = 2;
		 */
		
		j = i>6?1:2;
		System.out.println(j);
		
		//Switch 
		
		int newn = 6;
		
		switch(newn)
		{
		case 1:
			System.out.println("One");
		break;
		case 2:
			System.out.println("Two");
		break;
		case 3:
			System.out.println("three");
		break;
		case 4:
			System.out.println("Four");
		break;
		case 5:
			System.out.println("Five");
		break;
		default:
			System.out.println("No Match");
		}
		
		
	}

}
