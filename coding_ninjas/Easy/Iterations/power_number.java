/*
Write a program to find x to the power n (i.e., x^n). Take x and n from the user. You need to print the answer.
Note: For this question, you can assume that 0 raised to the power of 0 is 1
*/

import java.util.* ;
import java.io.*; 
import java.lang.Math;
class power_number {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long n = sc.nextLong();
        
		if(n == 0)
			System.out.println(1);

		else if(x == 0)
			System.out.println(0);

		else {
			long result = calculatePower(x, n);
			System.out.println(result);
		}
	}

	public static long calculatePower(long x, long n) {
		long result = 1;
		for(int i = 0; i < n; i++) {
			result *= x;
		}
		return result;
	}
}