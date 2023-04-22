// Write a Java program to extract the first half of a string of even length.
import java.util.*;
import java.lang.*;
public class Exercise_69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a string of even character: ");
        String main_string = sc.nextLine();
        System.out.println(main_string.substring(0, main_string.length()/2));
    }
}
