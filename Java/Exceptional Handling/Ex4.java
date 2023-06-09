/*
Write a Java program that reads a list of numbers from a file and throws an exception if any of the numbers are positive. 
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex4 {
  public static void main(String[] args) {
    try {
      readFile("test1.txt");
    } catch (FileNotFoundException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  public static void readFile(String fileName) throws FileNotFoundException {
    File file = new File(fileName);
    Scanner scanner = new Scanner(file);

    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      System.out.println(line);
    }

    scanner.close();
  }
}