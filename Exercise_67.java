// Write a Java program to insert a word in the middle of the another string.
//Insert "Tutorial" in the middle of "Python 3.0", so result will be Python Tutorial 3.0
import java.lang.*;
public class Exercise_67 {
    public static void main(String[] args)
    {
        String main_string = "Python 3.0";
        String word = "Tutorial";
        System.out.println(main_string.substring(0, 7) + word + main_string.substring(6));
    }
}
