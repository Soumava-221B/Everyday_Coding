// Write a Java program where a string starts with a specific number.

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Ex9 {
    public static void main(String args[])
    {
        System.out.println(validate("5-3452165939"));
        System.out.println(validate("4-5683923425"));
    }
    public static String validate(String text) {
        Pattern pattern = Pattern.compile("^5.*$");
        Matcher m = pattern.matcher(text);

        if(m.find())
            return "Valid match";
        else
            return "Not a valid match";
    }
}