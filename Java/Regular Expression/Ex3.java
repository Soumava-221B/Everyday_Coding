// Write a Java program to find sequences of lowercase letters joined by an underscore.

import java.util.Scanner;
public class Ex3 {
 
   public static void main(String[] args) {
	   
	    System.out.println(validate("java_exercises"));
		System.out.println(validate("Java_exe"));
		System.out.println(validate("helo_wolr"));		
        }

   public static String validate(String text) {
	   if (text.matches("^[a-z]+_[a-z]+$"))
                return "Found a match!";
       else
                return "Not matched!";
   }
}