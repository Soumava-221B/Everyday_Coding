// Write a java program to divide two numbers and print on the screen
import java.util.Scanner;
public class Exercise_3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int a = sc.nextInt();
        System.out.print("Input the second number: ");
        int b = sc.nextInt();
        int d = (a/b);
        System.out.println();
        System.out.println("The division of a and b is: " +d);
    }
}
