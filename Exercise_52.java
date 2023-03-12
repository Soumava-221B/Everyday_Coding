// Write a Java program to calculate the sum of two integers and return true
// if the sum is equal to a third integer.
import java.util.*;
public class Exercise_52 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int x = in.nextInt();
        System.out.print("Enter the second number: ");
        int y = in.nextInt();
        System.out.print("Enter the third number: ");
        int z = in.nextInt();
        System.out.print("The sum of first two numbers is equal to third: "+test(x, y, z,true));
        System.out.print("\n");
    }

    public static boolean test(int p, int q, int r, boolean xyz)
    {
        if(xyz)
            return (r > q);
        return (q > p && r > q);
    }
}
