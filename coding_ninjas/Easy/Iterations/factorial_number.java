/*
Write a program to find the factorial of a number. Factorial of n is:
n! = n*(n-1)*(n-2)*(n-3)...* 1
Ouput the factorial of 'n'. If it does not exist, output 'Error'.
*/

import java.util.Scanner;
class factorial_number {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
        long fact = 1;

		if(n < 0)
			System.out.println("Error");

		else if(n != 0)
		   {
		for(int i = 1; i <= n; i++) {
           fact *= i;
		}
			System.out.println(fact);
		}

		else
			System.out.println(1);
	}
}