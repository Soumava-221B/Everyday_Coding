// Write a java program to find the number of values in a given range divisible by a given value.
/*
* Sample Data:
For example x = 5, y=20 and p =3, find the number of integers within the range x..y and that are divisible by p i.e. { i :x ≤ i ≤ y, i mod p = 0 }
* */
import java.util.*;
public class Exercise_56 {
    public static void main(String[] args) {
        int x = 5;
        int y = 20;
        int p = 3;
        System.out.println(result(x,y,p));
    }
    public static int result(int x, int y, int p) {
        if (x%p == 0)
            return( y/p - x/p + 1);
        return (y/p - x/p);
    }
}
