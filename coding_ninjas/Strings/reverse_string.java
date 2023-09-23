/*
Reverse the given string word wise. The last word in the given string should come at 1st place, the last-second word at 2nd place, and so on. Individual words should remain as it is.
*/

import java.util.Scanner;

class Solution {

    static String reverseStringWordWise(String input) {

        String[] w = input.split(" ");
        String result = "";
        for(int i = w.length-1; i >= 0; i--) 
            result += w[i] + " ";

        return result.trim();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
    }
}