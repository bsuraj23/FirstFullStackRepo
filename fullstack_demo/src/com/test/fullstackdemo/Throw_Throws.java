package com.test.fullstackdemo;

public class Throw_Throws {
	
	  
		   void checkMarks(int marks){  
			if(marks<50)  
			   throw new ArithmeticException("Exam failed");  
			else  
			   System.out.println("Exam passed");  
		   }  
		   
		   int average(int marks) throws ArithmeticException
		   {  
		 	    int result= marks/0;
		 	    return result; 
		   }

	public static void main(String[] args) {
	
		Throw_Throws obj1 = new Throw_Throws();
		int n=45;
		try
	    {
		    System.out.println (obj1.average(n)); 
	    }  
	    catch(ArithmeticException except)
	    {
		    System.out.println("Using Throws :   Error in dividing number by zero\n\n");
	    } 
		 System.out.println("Using Throw");
		obj1.checkMarks(n);
  
	}

}
