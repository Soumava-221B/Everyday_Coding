/*Write a Java program that accepts three integers from the user and return true if the second number is greater than first number and third number is greater than second number. If another variable "abc" is true second number does not need to be greater than first number.
 */
import java.util.Scanner;
public class Exercise_53 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int x = in.nextInt();
        System.out.print("Input the second number: ");
        int y = in.nextInt();
        System.out.print("Input the third number : ");
        int z = in.nextInt();
        System.out.print("The result is: "+test_last_digit(x, y, z,true));
        System.out.print("\n");
    }

    public static boolean test_last_digit(int p, int q, int r, boolean xyz)
    {
        return (p % 10 == q % 10) || (p % 10 == r % 10) || (q % 10 == r % 10);
    }
}
