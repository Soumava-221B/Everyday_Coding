// Write a Java program to find the sequence of one upper case letter followed by lower case letters.

import java.util.Scanner;
public class Ex4 {
   public static void main(String[] args) {
	  
	    System.out.println(validate("Java"));
	    System.out.println(validate("java"));
        System.out.println(validate("Ja"));
      		
        }
   public static String validate(String text) {
	   if (text.matches("[A-Z][a-z]+$"))
                return "Found a match!";
       else
                return "Not matched!";
   }
}