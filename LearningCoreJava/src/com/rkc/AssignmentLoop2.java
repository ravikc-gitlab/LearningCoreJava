package com.rkc;
public class AssignmentLoop2 {
	public static void main(String[] args)
	{
		for (int i=65; i<=81; i++)
		{
			for(int j=65; j<=i; j++)
				{
				System.out.print((char)(j) + " ");
				}
		System.out.println();
		
		}
	}
}