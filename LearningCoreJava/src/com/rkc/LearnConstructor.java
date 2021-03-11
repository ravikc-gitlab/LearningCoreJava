package com.rkc;

public class LearnConstructor {
	
	int x;  // Create a class attribute
	int modelYear;
	String modelName;
	/*
	 * Constructor is a member method
	 * It will not return anything 
	 * it has same name as ClassName
	 * it will be used to allocate memory
	 */
	
  // Create a class constructor for the LearnConstructor class
	  public LearnConstructor() {
	    x = 5;  // Set the initial value for the class attribute x
	  }
	  
	  public LearnConstructor(int y) {
		    x = y;  // Set the initial value for the class attribute x
		  } 
	  
	  public  LearnConstructor(int year, String name) {
		    modelYear = year;
		    modelName = name;
		  }
	
	  public static void main(String[] args) {
		  // LearnConstructor myObj = new LearnConstructor(); // Create an object of class Main (This will call the constructor)
		  //LearnConstructor myObj = new LearnConstructor(7);  
		  //System.out.println(myObj.x); // Print the value of x
		  LearnConstructor myCar = new LearnConstructor(2010, "Hyndai i10");
		    System.out.println(myCar.modelYear + " " + myCar.modelName);
		  }

}
