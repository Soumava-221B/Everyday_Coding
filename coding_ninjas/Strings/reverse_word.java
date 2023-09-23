/*
Aadil has been provided with a sentence in the form of a given string as a function parameter. The task is to implement a function so as to print the sentence such that each word in the sentence is reversed.
*/

import java.util.* ;
import java.io.*; 
import java.util.Scanner;

class Solution {

    static String reverseEachWord(String input)
    {
     String[] words = input.split(" ");
     String result = "";
     
     for (String word : words) {
         String reversedWord = "";
         for (int i = word.length() - 1; i >= 0; i--) {
             reversedWord += word.charAt(i);
         }
         result += reversedWord + " ";
     }
     return result.trim();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseEachWord(input);
        System.out.println(ans);
    }
}