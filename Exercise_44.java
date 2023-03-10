// Write a Java program to find the size of a specified file.
import java.util.Scanner;
import java.io.File;
public class Exercise_44 {
    public static void main(String[] args) {
        System.out.println("/home/soumava/abc.txt  : " + new File("abc.txt").length() + " bytes");
        System.out.println("/home/soumava/test.txt  : " + new File("test.txt").length() + " bytes");
    }
}
