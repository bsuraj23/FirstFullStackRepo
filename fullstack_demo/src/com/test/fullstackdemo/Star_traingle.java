package com.test.fullstackdemo;

public class Star_traingle {
	
	
	    public static void rightTriangle(int n) 
	    { 
	    	int i, j; 
	    	  
	        // outer loop to handle number of rows 
	        
	        for(i=0; i<n; i++) 
	        { 
	  
	            //  inner loop to handle number of columns 
	                
	            for(j=0; j<=i; j++) 
	            { 
	                // printing stars 
	                System.out.print("* "); 
	            } 
	  
	            // ending line after each row 
	            System.out.println(); 
	        } 
	   } 
	        public static void leftTriangle(int n) 
	        { 
	            int i, j;  
	            for(i=0; i<n; i++) //outer loop for number of rows(n)
	            { 
	            for(j=2*(n-i); j>=0; j--) // inner loop for spaces 
	                {           
	                    System.out.print(" "); // printing space
	                } 
	                for(j=0; j<=i; j++) //  inner loop for columns
	                {       
	                    System.out.print("* "); // print star
	                }           
	                System.out.println(); // ending line after each row
	            } 
	        } 
	        
	        public static void main(String args[])
	        {
	        	int n=6;
	        	rightTriangle(n);
	        	leftTriangle(n);
	        	
	       }
				
	}