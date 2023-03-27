// Write a Java program to measure how long some code takes to execute in nanoseconds.
import java.lang.*;
public class Exercise_91 {
    public static void main(String[] args)
    {
        long startTime = System.nanoTime();
        int i;
        System.out.println ("The first 10 natural numbers are:\n");
        for (i=1;i<=10;i++)
        {
            System.out.println (i);
        }
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Estimated time (in nanoseconds) to get the first 10 natural numbers: "+estimatedTime);
    }
}
