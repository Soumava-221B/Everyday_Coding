/*
You have been given an integer array/list(ARR) of size 'N'. If only contains 0s, 1s and 2s. Write a solution to sort
this array/list.
*/

import java.util.* ;
import java.io.*; 
public class  dutch_flag_algorithm
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array: ");
        for(int i=0; i<n; i++) 
            arr[i] = sc.nextInt();
        
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        int temp;

        while(mid <= high) {
            switch(arr[mid]) {
                case 0: {
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
            }
        }
        System.out.print("Sorted array: ");
        for(int j=0; j<arr.length; j++)
            System.out.print(arr[j] + " ");

        System.out.println();
    }
}