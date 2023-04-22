// Write a Java program that accepts two integer values between 25 to 75 and return true if there is a common digit in both numbers.
import java.util.*;
public class Exercise_64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int a = sc.nextInt();
        System.out.print("Input the second number: ");
        int b = sc.nextInt();
        System.out.println("Result: "+common_digit(a, b));
    }

    public static boolean common_digit(int p, int q)
    {
        if (p<25 || q>75)
            return false;
        int x = p % 10;
        int y = q % 10;
        p /= 10;
        q /= 10;
        return (p == q || q == y || x == q || x == y);
    }
}
