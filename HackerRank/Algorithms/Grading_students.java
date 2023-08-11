import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Grading_students {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the grades to be entered: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int grade = sc.nextInt();
            if (grade >= 38) {
                if (grade % 5 >= 3) {
                    grade += 5 - (grade % 5);
                }
            }
            System.out.println("After round off: "+grade);
        }
    }
}