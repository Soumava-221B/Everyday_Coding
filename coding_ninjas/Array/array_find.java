// Find if an element is present in the array or not.

import java.io.*;
import java.util.*;

public class array_find {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array: ");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter the element you want to search: ");
        int x = sc.nextInt();

        int result = search(arr, arr.length, x);
        if(result == -1)
            System.out.println("Element is not present in array: " + "\n");
        
        else 
            System.out.print("Element is present at index " + result + "\n");
    }

    public static int search(int[] arr, int n, int x) {
        int i;
        for(i = 0; i < n; i++)
            if(arr[i] == x)
                return i;

        return -1;
    }
    
}