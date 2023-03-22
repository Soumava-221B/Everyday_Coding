// Write a Java program to create a new string taking first three characters from a given string. If the length of the given string is less than 3 use "#" as substitute characters.
//
//Test Data: str1 = "Python"
//str2 = " "
import java.util.*;
import java.lang.*;
public class Exercise_72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the a string: ");
        String str1 = sc.nextLine();
        int len = str1.length();
        if(len >= 3)
            System.out.println(str1.substring(0, 3));
        else if (len == 1)
            System.out.println(str1.charAt(0)+"##");
        else
            System.out.println("###");
    }
}
