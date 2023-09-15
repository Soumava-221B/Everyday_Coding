import java.io.*;
import java.util.*;
class Solution {
	
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