// Write a Java program to replace all vowels in a string with a specified character.

public class Ex16 {
    public static void main(String[] args) {
        String text = "LOWERED";
        System.out.println("Original string: "+text);
        System.out.println("After replacing vowel(s) with specified Charcter: "+validate(text, '#'));
        text = "Java";
        System.out.println("\nOriginal string: "+text);
        System.out.println("After replacing vowel(s) with specified Character: "+validate(text, '*'));
    }

    public static String validate(String text, char chr) {
        return text.replaceAll("[aeiouAEIOU]", "" + chr);
    }
}