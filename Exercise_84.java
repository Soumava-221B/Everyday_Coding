// Write a Java program to take the last three character from a given string and add the three characters at both the front and back of the string. String length must be greater than three and more.
// Test data: "Python" will be "honPythonhon"
import java.util.*;
import java.io.*;
public class Exercise_84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the string: ");
        String string1 = sc.nextLine();
        System.out.print("Input the length string: ");
        int slength = sc.nextInt();
        if(slength > string1.length()) {
            slength = string1.length();
        }

        String subpart = string1.substring(string1.length() - 3);
        System.out.println(subpart + string1 + subpart);
    }
}
