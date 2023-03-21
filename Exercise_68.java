// Write a Java program to create a new string of 4 copies of the last 3 character of the original string. The length of the original string must be 3 and above.
import java.util.*;
import java.lang.*;
public class Exercise_68 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the string: ");
        String main_string = sc.nextLine();

        String last_three_chars = main_string.substring(main_string.length() - 3);
        System.out.println(last_three_chars + last_three_chars + last_three_chars + last_three_chars);
    }
}
