package com.ibm.sumapp;

public class Adder {

	
	public int add( int a, int b ) {
		int sum = a + b;
		
		// introduce an intermittent error
 		if( a == 3 ) { 
 			sum = a*a + b*b;
 		} 
		
		return sum;
	}
	
}
