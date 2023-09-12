// Find the maximum and minimum in the array.

import java.io.*;
import java.util.*;

public class array_ex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements in the array: ");
        for(int i = 0; i < n; i++) 
            arr[i] = sc.nextInt();
        
        int max = arr[0], min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i])
                max = arr[i];
            if(min > arr[i])
                min = arr[i];
        }

        System.out.print("Maximum Value = " + max + "\n");
        System.out.print("Minimum Value = " + min + "\n");
    }
}