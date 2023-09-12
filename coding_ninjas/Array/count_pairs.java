// Count pairs with given sum in the array.

import java.io.*;
import java.util.*;

public class count_pairs {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements in the array: ");
        for(int i = 0; i < n; i++) 
            arr[i] = sc.nextInt();

        System.out.print("Enter number to find the sum of pairs in the array: ");
        int sum = sc.nextInt();
        int count = 0;

        for(int i = 0; i < n; i++)
            for(int j = i + 1; j < n; j++)
                if(arr[i] + arr[j] == sum)
                    count++;
        System.out.print("Count of pairs is " + count + "\n");
    }
}