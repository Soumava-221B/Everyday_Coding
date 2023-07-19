// Write a Java program to find the word Python in a given string, if the word Python present in the string return C++. Ignore case sensitive.

import java.util.*;

public class Ex13 {
 
   public static void main(String[] args) {
	   
	    String text = "python";
		System.out.println("Original string: "+text);
		System.out.println("New string: "+validate(text));
		text = "JavaScript";
		System.out.println("\nOriginal string: "+text);
		System.out.println("New string: "+validate(text));
        
        }

   public static String validate(String text) {
	   	String str = text.toLowerCase();
		if (str.contains("python")) {
			return "Java";
		} 
		return "C++";
   }
}