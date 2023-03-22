// Write a Java program to create a new string taking first and last character from two given strings. If the length of either string is 0 use "#" for missing character.
import java.lang.*;
import java.util.*;
public class Exercise_73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str1 = sc.nextLine();
        System.out.print("Input the second string: ");
        String str2 = sc.nextLine();

        int length2 = str2.length();
        String result = "";
        result += (str1.length() >= 1) ? str1.charAt(0) : '#';
        result += (length2 >= 1) ? str2.charAt(length2 - 1) : '#';
        System.out.println(result);
    }
}
