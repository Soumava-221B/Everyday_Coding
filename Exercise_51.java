// Write a Java program to convert a string to an integer in java.
import java.util.Scanner;
public class Exercise_51 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number(string): ");
        String str1 = in.nextLine();
        int result = Integer.parseInt(str1);
        System.out.printf("The integer value is: %d",result);
        System.out.printf("\n");
    }
}
