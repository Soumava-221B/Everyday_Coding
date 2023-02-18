import java.io.*;
import java.util.*;
public class GFG_Print_1toN {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-->0)
        {
            Solution obj = new Solution();
            int N;

            N = sc.nextInt();

            obj.printNos(N);
            System.out.println();
        }
    }
}

class Solution
{
    public void printNos(int N)
    {
        if (N == 0)
            return;
        printNos(N-1);
        System.out.println(N+" ");
    }
}