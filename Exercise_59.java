// Write a Java program to convert a given string into lowercase.
import java.util.*;
public class Exercise_59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a sentence: ");
        String line = sc.nextLine();
        line = line.toLowerCase();
        System.out.println(line);
    }
}
