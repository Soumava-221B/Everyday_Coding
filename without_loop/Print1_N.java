package without_loop;
import java.util.*;
public class Print1_N {
    static void printNos(int n)
    {
        if(n > 0)
        {
            printNos(n-1);
            System.out.println(n+" ");
        }
        return;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto which you want to print");
        int t = sc.nextInt();
        printNos(t);
    }
}
