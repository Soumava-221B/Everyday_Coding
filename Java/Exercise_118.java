// Write a Java program to get the first occurrence (Position starts from 0.) of a string within a given string.
import java.util.*;
public class Exercise_118 {
public static void main(String[] args) {
   		String s = "Python";
   		  String t = "yt"; 		
   System.out.printf(String.valueOf(strStr(s, t))+"\n");
		  }     
public static int strStr(String source, String target) {
        if (source == null || target == null) {
            return -1;
        }
        if ("".equals(target) || source.equals(target)) {
            return 0;
        }
        int i = 0;
        int last = source.length() - target.length() + 1;
        while (i < last) {
            if (source.charAt(i) == target.charAt(0)) {
                boolean equal = true;
                for (int j = 0; j < target.length() && equal; ++j) {
                    if (source.charAt(i + j) != target.charAt(j)) {
                        equal = false;
                    }
                }
                if (equal) {
                    return i;
                }
            }
            ++i;
        }
        return -1;
    }
}