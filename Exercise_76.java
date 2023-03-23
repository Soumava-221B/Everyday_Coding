// Write a Java program to test if the first or the last elements of two arrays of integers are same. The length of the two arrays must be greater than or equal to 2.
public class Exercise_76 {
    public static void main(String[] args)
    {
        int[] num_array1 = {50, -20, 0, 30, 40, 60, 12};
        int[] num_array2 = {45, 20, 10, 20, 30, 50, 11};

        if(num_array1.length>=2 && num_array2.length>=2)
        {
            System.out.println(num_array1[0] == num_array2[0] || num_array1[num_array1.length-1] == num_array2[num_array2.length-1]);
        }
        else
        {
            System.out.println("Array lengths less than 2.");
        }
    }
}
