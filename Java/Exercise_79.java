// Write a Java program to rotate an array (length 3) of integers in left direction. Test Data: {20, 30, 40} Expected output: {30, 40, 20}
import java.util.Arrays;
public class Exercise_79 {
    public static void main(String[] args) {
        int[] array_nums = {20, 30, 40};
        System.out.println("Original Array: "+Arrays.toString(array_nums));
        int[] new_array_nums = {array_nums[1], array_nums[2], array_nums[0]};
        System.out.println("Rotated Array: "+Arrays.toString(new_array_nums));
    }
}
