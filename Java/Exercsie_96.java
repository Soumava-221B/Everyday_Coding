// Write a Java program to check if an array of integers contains a specified number next to each other or there are two same specified numbers separated by one element.
import java.util.*;
import java.io.*;
public class Exercsie_96 {
    public static void main(String[] args)
    {
        int[] array_nums = {10, 70, 80, 50, 20, 13, 50};
        boolean testd = false;
        int result=0;
        int x = 10;
        int y = 20;

        for(int i = 0; i < array_nums.length; i++) {
            if(array_nums[i] == x)
                testd = true;

            if(testd && array_nums[i] == y)
            {
                System.out.printf( String.valueOf(true));
                result = 1		 ;
            }
        }
        if (result==0)
        {
            System.out.printf( String.valueOf(false));
        }
        System.out.printf("\n");
    }
}
