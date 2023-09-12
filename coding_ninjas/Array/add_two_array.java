import java.io.*;
import java.util.*;

public class add_two_array {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array1");
        int n = sc.nextInt();
        System.out.println("Enter the size of the array2");
        int m = sc.nextInt();
        int[] array1 = new int[n];
        int[] array2 = new int[m];

        System.out.println("Enter the numbers in array1:");
        for(int i = 0; i < n; i++) 
            array1[i] = sc.nextInt(); 
        
        System.out.println("Enter the numbers in array2:");
        for(int j = 0; j < m; j++)
            array2[j] = sc.nextInt();

        int sum = 0;
        for(int i = 0; i < array1.length; i++) 
            sum += array1[i];

        for(int i = 0; i < array2.length; i++) 
            sum += array2[i];

        System.out.println(sum);
        
    }
}