// Write a Java program that accepts an integer (n) and computes the value
// of n + nn + nnn
import java.util.Scanner;
public class Exercise_43 {
    public static void main(String[] args){
        int n;
        char s1, s2, s3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        System.out.printf("%d %d%d + %d%d%d\n", n, n, n, n, n, n);
    }
}
