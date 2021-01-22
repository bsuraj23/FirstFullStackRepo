package com.test.fullstackdemo;

public class Exception_handler {

	public static void main(String[] args) {
		
			      int a, b;
			      try {
			         //It may throw Exception
			         a = 0;
			         b = 10 / a;
			         System.out.println(b);
			         System.out.println(" I am at the end of try block");
			      }
			      catch (ArithmeticException e) { 
			         /* This block will only execute if any Arithmetic exception 
			          occurs in try block */
			         System.out.println("Should not divide a number by zero");
			      }
			      catch (Exception e) {
			         /* This is a generic Exception handler which means it can handle
			            all the exceptions. This will execute if the exception is not
			            handled by previous catch blocks.
			          */
			         System.out.println("Exception occurred");
			      }
			      System.out.println("I am out of try-catch block in Java.");
			   }
			}



