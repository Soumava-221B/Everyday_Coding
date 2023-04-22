// Write a Java program to create an array (length # 0) of string values. The elements will contain "0". "1", "2" ...and ... n-1.
import java.util.*;
import java.io.*;
public class Exercise_95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = sc.nextInt();;
        String[] arr_string = new String[n];

        for(int i = 0;i < n; i++)
            arr_string[i] = String.valueOf(i);
        System.out.println("New Array: "+Arrays.toString(arr_string));
    }
}
