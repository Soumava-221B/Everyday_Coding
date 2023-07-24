/*
(PIN): A personal identification number, or PIN, is a string of at least four digits used to unlock a bank account or card to which it has been assigned.

Write a Java program to validate a personal identification number (PIN). Assume a PIN number is 4, 6 or 8.
*/

public class Ex18 {
 
   public static void main(String[] args) {	   
	    String n = "123";
		System.out.println("Original PIN Number: "+n);
		System.out.println("Is the said PIN number is valid? "+validate(n));
	    n = "1234";
		System.out.println("Original PIN Number: "+n);
		System.out.println("Is the said PIN number is valid? "+validate(n));
	    n = "12345";
		System.out.println("Original PIN Number: "+n);
		System.out.println("Is the said PIN number is valid? "+validate(n));		
        }

   public static boolean validate(String n) {
	   return n.matches("\\d{4}|\\d{6}|\\d{8}");
   }
}