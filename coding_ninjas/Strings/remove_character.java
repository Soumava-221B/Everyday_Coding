/*
For a given string(str) and a character X, write a function to remove all the occurences of X from the given string and return it. 
The input string will remain unchanged if the given character(X) doesn't exist in the input string.
*/

import java.util.* ;
import java.io.*; 
import java.util.Scanner;

class Solution {

    static String removeAllOccurrencesOfChar(String input, char c) {
        // Write your code here
        StringBuilder sb = new StringBuilder(input);

        for(int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == c) {
                sb.deleteCharAt(i);
                i--;
            }
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char c = sc.next().charAt(0);
        String ans = removeAllOccurrencesOfChar(input, c);
        System.out.println(ans);
    }
}