/*
Problem Statement 
Data type refers to the type of value a varible had and the way the computer interprets it.

Each data type has a differnt size. You've studied 5 different data types and the sizes of the data types:

Integer: 4 byte
Long: 8 byte
Float: 4 byte
Double: 8 byte
Character: 1 byte
*/

import java.util.Scanner;

public class Solution {
    public static int dataTypes(String type) {
        if(type.contentEquals("Integer") || type.contentEquals("Float")) 
            return 4;
        
        else if(type.contentEquals("Long") || type.contentEquals("Double")) 
            return 8;
        
        else 
            return 1;
        
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data type name: ");
        String name = sc.next();
        int n = dataTypes(name);
        System.out.println(n);
    }
}