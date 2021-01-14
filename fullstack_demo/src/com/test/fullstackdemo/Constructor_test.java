package com.test.fullstackdemo;

public class Constructor_test {
	int x;
	String name;
	String noValue;

	 Constructor_test() {
		
		 System.out.println("This is no parameter constructor");
		 
	}
	
	public Constructor_test(int y, int z)
	{
		
		x = y+z;
		System.out.println("This is parameterized constructor & the value of x is "+ x);
		
	}
	
	Constructor_test(String s) {
		
		System.out.println("parameterized constructor with string "+ s);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Constructor_test con1 = new Constructor_test();
		Constructor_test con2 = new Constructor_test(4,6);
		Constructor_test con3 = new Constructor_test("Bhargavi");
		
		
		

	}
}

	
	


