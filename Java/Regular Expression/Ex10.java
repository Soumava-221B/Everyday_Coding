// Write a Java program to remove leading zeros from a given IP address.

import java.util.*;
public class Ex10 {
    public static void main(String args[]) 
    {
        System.out.println(validate("316.08.094.196"));
		System.out.println(validate("07.007.0007.00007"));
		System.out.println(validate("01.102.103.104"));
    }
    public static String validate(String ip) {
          return ip.replaceAll("(?<=^|\\.)0+(?!\\.|$)","");
   }
}