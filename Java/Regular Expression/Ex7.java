// Write a Java program that matches a word containing 'g', not at the start or end of the word.

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Ex7 {
 
   public static void main(String[] args) {
	   
	    System.out.println(validate("The quick brown fox jumps over the lazy dog."));
		System.out.println(validate("Java Exercises."));
		System.out.println(validate("Programming Language"));
        }

   public static String validate(String text) {
	    Pattern pattern = Pattern.compile("\\Bg\\B");
		 Matcher m = pattern.matcher(text);
		
	   if (m.find())
                return "Found a match!";
       else
                return "Not matched!";
   }
}