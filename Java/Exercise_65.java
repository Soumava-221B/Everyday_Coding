// Write a Java program to calculates the modulus of two numbers without using any in build modules operator.
import java.util.*;
public class Exercise_65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int a = sc.nextInt();
        System.out.print("Input the second number: ");
        int b = sc.nextInt();
        int divided = a / b;
        int result = a - (divided * b);
        System.out.println(result);
    }
}
