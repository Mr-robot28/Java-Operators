package com.opreator;

public class Operator_Pratice {

	
	public static void main(String[] args) {
		
		System.out.println("Q1: int a = 10; a += 5; a -= 3; a *= 2; a /= 4; System.out.println(a);");
        int a1 = 10; 
        a1 += 5; // a1 = 10 + 5 = 15
        a1 -= 3; // a1 = 15 - 3 = 12
        a1 *= 2; // a1 = 12 * 2 = 24
        a1 /= 4; // a1 = 24 / 4 = 6
        System.out.println("=> " + a1); // Output: 6
        System.out.println();
        
        System.out.println("Q2: int a=5,b=10,c=15; System.out.println((a<b)&&(b<c));");
        int a2 = 5, b2 = 10, c2 = 15;
        System.out.println("=> " + ((a2 < b2) && (b2 < c2))); // true && true = true
        System.out.println();

        System.out.println("Q3: System.out.println((a>b)||(b<c)); System.out.println(!(a<c));");
        System.out.println("=>a. " + ((a2 > b2) || (b2 < c2))); // false || true = true
        System.out.println("=>b. " + (!(a2 < c2))); // !(true) = false
        System.out.println();
        
        System.out.println("Q4: int x=10,y=20; System.out.println(x++ + ++y);");
        int x4 = 10, y4 = 20;
        System.out.println("=> " + (x4++ + ++y4)); // 10 + 21 = 31
        System.out.println();

        System.out.println("Q5: int a=5,b=2; System.out.println(a % b);");
        int a5 = 5, b5 = 2;
        System.out.println("=> " + (a5 % b5)); // remainder = 1
        System.out.println();

        System.out.println("Q6: int p=7,q=3; System.out.println(p*q + p/q);");
        int p6 = 7, q6 = 3;
        System.out.println("=> " + (p6 * q6 + p6 / q6)); // 21 + 2 = 23
        System.out.println();

        System.out.println("Q7: int n=5; System.out.println(++n + n++);");
        int n7 = 5;
        System.out.println("=> " + (++n7 + n7++)); // (6 + 6) = 12, then n7 = 7
        System.out.println();
       
        System.out.println("Q8: int a=10,b=5,c; c=a++ + --b + a*b; System.out.println(c);");
        int a8 = 10, b8 = 5, c8;
        c8 = a8++ + --b8 + a8 * b8; // 10 + 4 + 11*4 = 58
        System.out.println("=> " + c8);
        System.out.println();
        
        System.out.println("Q9: int a=4,b=2; System.out.println(a << b);");
        int a9 = 4, b9 = 2;
        System.out.println("=> " + (a9 << b9)); // 4 * 2^2 = 16
        System.out.println();
        
        System.out.println("Q10: int a=8,b=2; System.out.println(a >> b);");
        int a10 = 8, b10 = 2;
        System.out.println("=> " + (a10 >> b10)); // 8 / 2^2 = 2
        System.out.println();
        
        System.out.println("Q11: int a=10; System.out.println(~a);");
        int a11 = 10;
        System.out.println("=> " + (~a11)); // ~10 = -11 (bitwise complement)
        System.out.println();
        
        System.out.println("Q12: int a=5,b=7; System.out.println(a & b);");
        int a12 = 5, b12 = 7;
        System.out.println("=> " + (a12 & b12)); // 0101 & 0111 = 0101 (5)
        System.out.println();

        System.out.println("Q13: int a=5,b=7; System.out.println(a | b);");
        System.out.println("=> " + (a12 | b12)); // 0101 | 0111 = 0111 (7)
        System.out.println();

        System.out.println("Q14: int a=5,b=7; System.out.println(a ^ b);");
        System.out.println("=> " + (a12 ^ b12)); // 0101 ^ 0111 = 0010 (2)
        System.out.println();
        
        System.out.println("Q15: int a=10; System.out.println(a++ + ++a + a--);");
        int a15 = 10;
        System.out.println("=> " + (a15++ + ++a15 + a15--)); 
        // a15=10+12+12=34, final a15=11
        System.out.println();
        
        System.out.println("Q16: int a=1; a += a++ + ++a; System.out.println(a);");
        int a16 = 1;
        a16 += a16++ + ++a16; // a16 = 1 + 1 + 3 = 5
        System.out.println("=> " + a16);
        System.out.println();
        
        System.out.println("Q17: int a=5,b=10; System.out.println(a==b);");
        int a17 = 5, b17 = 10;
        System.out.println("=> " + (a17 == b17)); // false
        System.out.println();
        
        System.out.println("Q18: int a=3,b=2; System.out.println(a*b + a/b);");
        int a18 = 3, b18 = 2;
        System.out.println("=> " + (a18 * b18 + a18 / b18)); // 6 + 1 = 7
        System.out.println();
        
        System.out.println("Q19: int a=5; a=a++ + ++a; System.out.println(a);");
        int a19 = 5;
        a19 = a19++ + ++a19; // 5 + 7 = 12
        System.out.println("=> " + a19);
        System.out.println();
        
        System.out.println("Q20: int a=10,b=5; System.out.println(a>b && a!=b);");
        int a20 = 10, b20 = 5;
        System.out.println("=> " + (a20 > b20 && a20 != b20)); // true && true = true
        System.out.println();
        
        System.out.println("Q21: int x=2,y=3; x*=y+1; System.out.println(x);");
        int x21 = 2, y21 = 3;
        x21 *= y21 + 1; // x21 = 2 * 4 = 8
        System.out.println("=> " + x21);
        System.out.println();
        
        System.out.println("Q22: int a=5; a+=a-=a*=a; System.out.println(a);");
        int a22 = 5;
        a22 += a22 -= a22 *= a22;
        // Step: a22 *= a22 -> 25, a22 -= 25 -> 0, a22 += 0 -> 0
        System.out.println("=> " + a22);
        System.out.println();
        
        System.out.println("Q23: int a=5; System.out.println(a++ + a++ + ++a);");
        int a23 = 5;
        System.out.println("=> " + (a23++ + a23++ + ++a23)); // 5 + 6 + 8 = 19
        System.out.println();
        
        System.out.println("\24: int a=2,b=3; System.out.println(a + b*a/b);");
        int a24 = 2, b24 = 3;
        System.out.println("=> " + (a24 + b24 * a24 / b24)); // 2 + 3*2/3 = 2 + 2 = 4
        System.out.println();
        
        System.out.println("Q25: int a=10,b=20; System.out.println(a<b && b>a);");
        int a25 = 10, b25 = 20;
        System.out.println("=> " + (a25 < b25 && b25 > a25)); // true && true = true
        System.out.println();
        
        System.out.println("Q26: int a=6,b=2; System.out.println((a/b)*(a%b));");
        int a26 = 6, b26 = 2;
        System.out.println("=> " + ((a26 / b26) * (a26 % b26))); // (3)*(0)=0
        System.out.println();
        
        System.out.println("Q27: int a=5,b=10,c=15; System.out.println((a<b && b>c) || !(b<c));");
        int a27 = 5, b27 = 10, c27 = 15;
        System.out.println("=> " + ((a27 < b27 && b27 > c27) || !(b27 < c27)));
        // (true && false) || !(true) -> false || false = false
	}
}
