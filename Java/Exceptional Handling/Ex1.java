/*
Write a Java program that throws an exception and catch it using a try-catch block.
*/

import java.util.Scanner;

public class Ex1 {
    public static void main(String args[]) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the dividend: ");
            int dividend = sc.nextInt();
            System.out.print("Enter the divisor: ");
            int divisor = sc.nextInt();
            int result = divideNumbers(dividend, divisor);
            System.out.println("Result: " + result);
        }

        catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static int divideNumbers(int dividend, int divisor) {
        if (divisor == 0)
            throw new ArithmeticException("Cannot divide the given number by zero!");

        return dividend / divisor;
    }

}