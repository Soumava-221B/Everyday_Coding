import java.util.Scanner;
public class sum_of_two_numbers {
    public static void main(String[] args)
    {
        int fno, sno, sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        fno = sc.nextInt();
        System.out.print("Input the second number: ");
        sno = sc.nextInt();
        sum = fno+sno;
        System.out.println("Sum two number is: "+sum);
    }
}
