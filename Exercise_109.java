// Write a Java program to form a staircase shape of n coins where every k-th row must have exactly k coins.
import java.util.Scanner;
public class Exercise_109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a positive integer: ");
        int n = sc.nextInt();
        if (n>0)
        {
            System.out.println("Number of rows: "+((int)((Math.sqrt(8 * (long)n + 1) - 1) / 2)));
        }
    }
}
