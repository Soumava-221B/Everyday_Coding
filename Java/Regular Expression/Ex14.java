/*
The word vowel comes from the Latin word vocal is, meaning "vocal" (i.e. relating to the voice). In English, the word vowel is commonly used to refer both to vowel sounds and to the written symbols that represent them (a, e, o, u, y), and sometimes I
Write a Java program to count the number of vowels in a given string using a regular expression.
Here we consider a, e, i, o, u are vowels (not y).
*/

public class Ex14 { 
   public static void main(String[] args) {	   
	    String text = "C++";
		System.out.println("Original string: "+text);
		System.out.println("New string: "+validate(text));
		text = "Java";
		System.out.println("\nOriginal string: "+text);
		System.out.println("New string: "+validate(text));
		text = "MID-CENTRALIZED";
		System.out.println("\nOriginal string: "+text);
		System.out.println("New string: "+validate(text));
		text = "LOWERED";
		System.out.println("\nOriginal string: "+text);
		System.out.println("New string: "+validate(text));
        }

   public static int validate(String text) {
	   return text.replaceAll("[^aeiouAEIOU]", "").length();
   }
}