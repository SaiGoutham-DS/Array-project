package org.sample;

public class Project1 {
	
	// Basically our java program Executed from Main method
	// Array also Executed from the MAin method
	
	public static void main ( String [] args ) {
		// Array is used for Stored multiple values of similar datatype in a single variable (or) Single Reference
		// Array is an index based one
		// index Starts from 0 and ends with n-1
		// Length/Size Starts from 1 and ends with n
		// Array is an fixed in size
		// Array will allow the duplicate values
		
		// Now we have to write the Array Syntax
		
		// Datatype Ref Name[] = new Datatype [ Size ];
		// end of the statement have to give semicolon ( ; ).
		
		int b [] = new int [5];
		// here i mentioned size value as 5
		
		b[4] = 23;
		b[2] = 34;// we can add the values Ascending order and decending order or randomly, anything we can give.
		b[1] = 98;
		b[0] = 67;
		b[3] = 12;
		
		// now we want to print the all values in the console.
		// if we have to print all values.
		// we have to follow the for loop to iterate the all values then only we can print the all values in our console
		
		for (int i = 0; i < b.length; i++) {
			// inside the for loop condition have to give business logic
			
			System.out.println(b[i]);
			
			// inside the business logic have to give the b[i] because i represents the all values and iterate the all values
			
			// we have to know about backend process how it will work
			
			// initialization           condition( i<b.length )         business logic b[i]       increment/decrement
			//   i=0                     0<5                              b[0] = 67                  i = 0+1=1
			//   i=1                     1<5                              b[1] = 98                  i = 1+1=2
			//   i=2                     2<5                              b[2] = 34                  i = 2+1=3
			//   i=3                     3<5                              b[3] = 12                  i = 3+1=4
			//   i=4                     4<5                              b[4] = 23                  i = 4+1=5
			//   i=5                     5<5 ===========here our condition have failed  so loop get terminated.
			
			
			
			
		}
		
 		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
