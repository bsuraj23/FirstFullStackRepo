package com.test.fullstackdemo;


public class Bitwise_Op {
	
	public static void main(String[] args) {
		
		int a=5,b=7,c;
		
		//a=0101,  b=0111 
		
		c=a & b;
		System.out.println("Bitwise And:"+c);
		
		c=a | b;
		System.out.println("Bitwise OR:"+c);

		c=a ^ b;
		System.out.println("Bitwise XOR:"+c);
		
		c= ~a;
		System.out.println("Bitwise complement of a is:" +c);
		
		c=a << 2;
		System.out.println("Bitwise Left shift of a is:"+c);
		
		c= a  >> 2;
		System.out.println("Bitwise Right shift 0f a is:"+c);
		
		//

	}

}
	