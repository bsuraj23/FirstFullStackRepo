package com.test.fullstackdemo;

public class Constructor_test {
	int x;
	
	 Constructor_test() {
		
		 System.out.println("This is no parameter constructor");
		 
	}
	 
	Constructor_test(int y, int z)
	{
		
		x = y+z;
		System.out.println("This is parameterized constructor & the value of x is "+ x);
		
	}
	
	Constructor_test(String b) {
		
		System.out.println("parameterized constructor with string "+ b);
		
	}
	
	public static void main(String[] args) {
				
		Constructor_test con1 = new Constructor_test();
		Constructor_test con2 = new Constructor_test(4,6);
		Constructor_test con3 = new Constructor_test("Bhargavi");

	}
}

	
	


