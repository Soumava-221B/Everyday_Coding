// Write a Java program to get the value of the environment variable PATH, TEMP, USERNAME.
import java.lang.*;
public class Exercise_90 {
    public static void main(String[] args)
    {
        System.out.println("\nEnvironment variable PATH: ");
        System.out.println(System.getenv("PATH"));

        System.out.println("\nEnvironment variable TEMP: ");
        System.out.println(System.getenv("TEMP"));

        System.out.println("\nEnvironment variable USERNAME: ");
        System.out.println(System.getenv("USERNAME"));
    }
}
