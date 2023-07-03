// Write a Java program that matches a string with a 'p' followed by anything ending in 'q'

import java.util.Scanner;
public class Ex5 {
 
   public static void main(String[] args) {
	   
	    System.out.println(validate("phkuyrt"));
		System.out.println(validate("pq"));
		System.out.println(validate("pccddbbjjjq"));
        System.out.println(validate("Jar"));
        System.out.println(validate("pjhut"));		
        }

   public static String validate(String text) {
	   if (text.matches("p.*?q$"))
                return "Found a match!";
       else
                return "Not matched!";
   }
}