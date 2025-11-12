package com.opreator;

public class Relational {
	
	  public static void main(String[] args) {
		
		  
		  int a = 10;
	        int b = 5;

	        // 1. == (Equal to)
	        System.out.println("== Operator: " + (a == b));  // false (10 is not equal to 5)

	        // 2. != (Not equal to)
	        System.out.println("!= Operator: " + (a != b));  // true (10 is not equal to 5)

	        // 3. > (Greater than)
	        System.out.println("> Operator: " + (a > b));    // true (10 is greater than 5)

	        // 4. < (Less than)
	        System.out.println("< Operator: " + (a < b));    // false (10 is not less than 5)

	        // 5. >= (Greater than or equal to)
	        System.out.println(">= Operator: " + (a >= b));  // true (10 is greater than 5)

	        // 6. <= (Less than or equal to)
	        System.out.println("<= Operator: " + (a <= b));  // false (10 is not less than or equal to 5)
	}
}
