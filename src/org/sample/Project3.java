package org.sample;

public class Project3 {
	// Basically the java program execution starts from the main method
	// Even array execution starts from the main method
	// we have to write main method
	
	public static void main ( String [] args) {
		// Array is used for stored multiple values of similar datatype in single ref name or single variable name
		//Array is an index based one 
		// Index value starts from 0 and ends with n-1
		// length/size starts from 1 and ends with n
		// array is an fixed in Size
		// Array will allocate the duplicate values
		// Array accept only similar data types
		//  memory wastage is high because it will allocate the memory at the compile time( Dis advantage)
		// have to create array Syntax
		
		String a[] = new String [7];
		// given the size as 7
		// under we have to add the String values
		// it will assign the values what we have gave of index 
		
		a[5]="apple";
		a[4]="orage";
		a[0]="fig";
		a[3]="kirnee";
		a[2]="banana";
		a[6]="lotus";
		a[1]="musk mullan";
		
		
		// now we have to iterate all values or print the all String values.
		// we have to use Normal for loop
		// Syntax = for ( initialization; condition; inc/dec ){
		//  inside the for loop have to give business logic
		//}
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
