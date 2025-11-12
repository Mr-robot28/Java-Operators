package com.opreator;

public class Assignment {

	  public static void main(String[] args) {
		
		  
		  // 1. = (Assignment)
	        int a = 10;
	        int b = 5;
	        a = b;   // assigns value of b to a
	        System.out.println("= Operator: a = " + a);  // Output: 5

	        // 2. += (Add and assign)
	        a = 10;
	        a += 5;  // same as a = a + 5
	        System.out.println("+= Operator: a = " + a); // Output: 15

	        // 3. -= (Subtract and assign)
	        a = 10;
	        a -= 3;  // same as a = a - 3
	        System.out.println("-= Operator: a = " + a); // Output: 7

	        // 4. *= (Multiply and assign)
	        a = 6;
	        a *= 4;  // same as a = a * 4
	        System.out.println("*= Operator: a = " + a); // Output: 24

	        // 5. /= (Divide and assign)
	        a = 20;
	        a /= 5;  // same as a = a / 5
	        System.out.println("/= Operator: a = " + a); // Output: 4

	        // 6. %= (Modulus and assign)
	        a = 17;
	        a %= 5;  // same as a = a % 5
	        System.out.println("%= Operator: a = " + a); // Output: 2
	    }
	
	
}
