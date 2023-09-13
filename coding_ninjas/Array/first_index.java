/*
Take an array with n elements with possibly duplicate elements as the input. The task is to find index of the 
first occurence of the element x in the array and, if it is not present, return -1.
*/

import java.io.*;
import java.util.*;
class first_index {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int[] arr = new int[n];

		for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

		int x = sc.nextInt();
		int result = search(arr, arr.length, x);
		if(result == -1)
            System.out.println(-1);

		else 
            System.out.println(result);
	}

	 public static int search(int[] arr, int n, int x) {
        int i;
        for(i = 0; i < n; i++)
            if(arr[i] == x)
                return i;

        return -1;

	 }
}