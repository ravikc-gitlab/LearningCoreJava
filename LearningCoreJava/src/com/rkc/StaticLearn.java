package com.rkc;

class Emp{
	int eid;
	int salary;
	static String ceo;	 
	
	public void show() {
		System.out.println(eid + " : " + salary + "  : " + ceo );
	}
}

public class StaticLearn {
	public static void main(String[] args)
	{
	 Emp Ravi = new Emp();
	 Ravi.eid = 1;
	 Ravi.salary = 5000000;
	 Emp.ceo = "Aarav";
			 
	 Emp Amita = new Emp();
	 Amita.eid = 2;
	 Amita.salary = 3000000;
	 Emp.ceo = "Aarav";
	 
	 Emp.ceo = "Kashu";
	 
	 
	 
	 Ravi.show();
	 Amita.show();

	 
	}

}
