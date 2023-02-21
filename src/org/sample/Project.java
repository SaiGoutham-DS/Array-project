package org.sample;

public class Project {
	
	// Basically Our Java Program Executed from Main Method
	// Array also Executed from Main Method
	
	public static void main ( String [] args) {
		
		
		// Array is used for Storing multiple values of Similar datatype in Single Variable (or) Single reference
		// Array is an index based one
		// index starts with 0 and  ends with n-1 
		// Length/Size starts with 1 and ends with n.
		// Array is an Fixed in Size
		// mainly Arrays will allow the duplicate values
		// Array having one Syntax we have to follow that
		
		// Datatype ref name [] = new Datatype [ size ];
		
		// end of the statement have to give semicolon
		
	    int a[] = new int [6];
		
	    // Above the syntax i giving size value as 6
	    // now we add to vales under the after creating the array syntax
	    // if adding the value extra ( out of Size )
	    
	    a[0] = 12; // we can add the values by assending order , decending order or randomly any thing we can give
	    a[1] = 45; 
	    a[2] = 34;
	    a[3] = 78;
	    a[5] = 78;
	    a[4] = 42;
	    a[5] = 65;
	    a[6] = 45;
	    
	    // Now i want get the particular value of 78
	    // by using business logic we can get the particular value
	    
	    System.out.println(a[3]);
		
	    // inside the business logic i have to mention a[ index value ] then only we will get otherwise we cannot get
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
