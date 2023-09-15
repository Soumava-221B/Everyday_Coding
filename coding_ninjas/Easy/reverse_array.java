/*
Given an array/list 'ARR' of integers and a position 'M'. You have to reverse the array after that postion.
Example:
We have an array ARR = {1, 2, 3, 4, 5, 6} and M = 3,
considering 0
based indexing so the subarray {5,6} will be reversed and our output array will be {1, 2, 3, 4, 6, 5}.
*/

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        // Write your code here.
        int e = arr.size()-1;

       for (int s = m+1; s < arr.size(); s++) {
            if(e>s){
                int x = arr.get(e);      
                arr.set(e, arr.get(s));
                arr.set(s, x);
                e--;
            }
        }  
    }
}