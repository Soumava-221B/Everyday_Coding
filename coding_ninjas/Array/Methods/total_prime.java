/*
 Write a program to find the total number of a number of a prime number in given interval. 
 Given two integers S and E, count all primes between S and E.
*/

import java.util.* ;
import java.io.*; 
import java.util.Scanner;
class CountPrime 
{   
    int count=0;
    int totalPrime(int start, int end)
    {
    for(int i=start;i<=end;i++)
        {
            int count1=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                count1++;
            }
            if(count1==2)
            count++;
        }
        return count;
    }   
}

class total_prime {
	public static void main(String args[]) {
		
		CountPrime obj = new CountPrime();
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		System.out.println(obj.totalPrime(s, e));
	}
}