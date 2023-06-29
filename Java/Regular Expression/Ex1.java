// Write a java program to check whether a string contains only a certain set of characters (in this case a-z, A-Z and 0-9).

import java.util.Scanner;
public class Ex1 {

    public static void main(String[] args) {
        System.out.println(validate("ABCDEFabcdef12450"));
        System.out.println(validate("SQL"));
        System.out.println(validate("Java"));
        System.out.println(validate("*&%@#!}{"));
        System.out.println(validate("w3resource.com"));
    }

    public static boolean validate(String text) {
        return text.matches("^[\\w]+$");
    }
}