// Write a program to input an integer N and print the sum of all its even digits and all its odd digits separately.
// Digits mean Numbers, not the places! If The Given Integer is "13245", Even Digits are 2 & 4, and Odd digits are 1,3 & 5.

import java.util.Scanner;
class sum_even_odd {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		long evenSum = 0, oddSum = 0;  // Initialization


		while(n!=0) {
			long digit = n%10; 

			if(digit%2 == 0)
				evenSum += digit;

			else
				oddSum += digit;

			n /= 10;
		}
		System.out.print(evenSum + " " + oddSum);
	}
}