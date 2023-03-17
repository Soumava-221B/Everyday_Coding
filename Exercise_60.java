// Write a Java program to find the penultimate (next to last) word of a sentence.
import java.util.Scanner;
public class Exercise_60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a sentence: ");
        String line = sc.nextLine();
        String[] words = line.split("[ ]+");
        System.out.println("Penultimate word: "+words[words.length - 2]);
    }
}
