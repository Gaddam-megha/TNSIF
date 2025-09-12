package com.tnsfi.sep11;

public class operators {
public static void main(String[] args) {
        
        int a = 10, b = 5;

        int sum = a + b;
        int diff = a - b;
        int prod = a * b;
        int div = a / b;
        int mod = a % b;

        boolean isEqual = (a == b);
        boolean isGreater = (a > b);
        boolean isLesser = (a < b);

        boolean andResult = (a > 0) && (b > 0);
        boolean orResult = (a > 0) || (b < 0);

        int x = 15;
        x += 5;

        int y = 10;
        int preInc = ++y;
        int postDec = x--;

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + diff);
        System.out.println("Multiplication: " + prod);
        System.out.println("Division: " + div);
        System.out.println("Modulus: " + mod);

        System.out.println("Equal: " + isEqual);
        System.out.println("Greater: " + isGreater);
        System.out.println("Lesser: " + isLesser);

        System.out.println("Logical AND: " + andResult);
        System.out.println("Logical OR: " + orResult);

        System.out.println("Assignment after += : " + x);
        System.out.println("Pre-increment: " + preInc);
        System.out.println("Post-decrement: " + postDec);
    }

}
