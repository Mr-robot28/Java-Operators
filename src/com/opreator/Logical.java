package com.opreator;

public class Logical {
  
	
	public static void main(String[] args) {
		
		boolean a = true;
        boolean b = false;
        
        
        System.out.println("Logical AND (&&) Operator:");
        System.out.println("true && true = " + (true && true));
         System.out.println("true && false = " + (true && false));
        System.out.println("false && ture = " + (false && true));
        System.out.println("false && false = " + (false && false));
        System.out.println("a && b = " + (a && b)); // true && false = false

        System.out.println("--------------------------------------------------");
        
        System.out.println("Logical OR (||) Operator:");
        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = " + (false || false));
        System.out.println("a || b = " + (a || b)); // true || false = true

        System.out.println("--------------------------------------------------");

        System.out.println("Logical NOT (!) Operator:");
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));
        System.out.println("!a = " + (!a)); // !true = false
        System.out.println("!b = " + (!b)); // !false = true
        
	}
}
