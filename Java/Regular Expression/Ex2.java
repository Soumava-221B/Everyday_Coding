// Write a Java program that matches a string that has a p followed by zero or more q's.

import java.util.Scanner;
public class Ex2 {
    public static void main(String args[]) {
        System.out.println(validate("p"));
		System.out.println(validate("pq"));
		System.out.println(validate("pqq"));		
		System.out.println(validate("pqr"));
		System.out.println(validate("prr"));
    }

    public static String validate(String text) {
        if (text.matches("pq*?"))
            return "Found a march";
        else
            return "Not matched!";
    }
}