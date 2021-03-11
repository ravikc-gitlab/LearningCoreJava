package com.rkc;

public class OperatorLearn {
	/*
	 * 
	 * Arithmetic +, -, *, / %
	 * Bitwise
	 * Relational
	 * Logical
	 * 
	 */
	public static void main(String[] args)
	{
		int First = 6, Second = 4;
		int Kudika = First + Second;
		int Tisivetha = First - Second;
		int Gunintha = First * Second;
		double Baginchuta	= (double) First / Second;
		int Migiledhi = First % Second;
		First++;
		First += Second;
		First = ++Second; //  Increment and then Assign
		First = Second++; //   Assign and then Increment
		
		System.out.println(Kudika);
		System.out.println(Tisivetha);
		System.out.println(Gunintha);
		System.out.println(Baginchuta);
		System.out.println(Migiledhi);
		
	}

}
