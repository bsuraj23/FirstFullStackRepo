package com.java.testprograms;

public class NumberAscending {

	private void sortAsc(int num[]) {
		// System.out.println(num.length);
		int j[] = new int[num.length];
		for (int i=0; i< num.length; i++) {
			System.out.println(" i "+ num[i]);
			if (num[i] < num [i++]) {
				System.out.println("num [i] "+ num [i]);
				System.out.println("num [i]++ "+ num [i++]);
			//	j[i] = num[i];
			}else {
				System.out.println(" else :: "+num[i]);
				//num[i] = num[i++];
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numToSort[] = {2,10,1,8,3};
		
		NumberAscending numAsc = new NumberAscending();
		numAsc.sortAsc(numToSort);
		
		
		
		

	}

}
