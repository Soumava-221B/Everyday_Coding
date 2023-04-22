// Write a Java program to create the concatenation of the two strings except removing the first character of each string. The length of the strings must be 1 and above.
import java.lang.*;
import java.util.*;
public class Exercise_71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the String1: ");
        String str1 = sc.nextLine();
        System.out.print("Input the String2: ");
        String str2 = sc.nextLine();

        System.out.println(str1.substring(1) + str2.substring(1));
    }
}
