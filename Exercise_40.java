// Write a Java program to list the available character sets in charset objects.
import java.nio.charset.Charset;
public class Exercise_40 {
    public static void main(String[] args){
        System.out.println("List of available character sets: ");
        for (String str: Charset.availableCharsets().keySet()) {
            System.out.println(str);
        }
    }
}