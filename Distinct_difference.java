// Given an array A[] of length N. For each index i (1<=i<=N), find the difference between the number of distinct elements in it's left and right side in the array.
import java.io.*;
import java.util.*;

class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static  void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}
public class Distinct_difference {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt((br.readLine()));
        while(t-- > 0) {

            int N;
            N = Integer.parseInt(br.readLine());

            int[] A = IntArray.input(br, N);

            Solution1 obj = new Solution1();
            ArrayList<Integer> res = obj.getDistinctDifference(N, A);

            IntArray.print(res);
        }
    }
}

class Solution1 {
    public static ArrayList<Integer> getDistinctDifference(int N, int[] A) {

        int left = 1;
        int right = N-2;
        int[] leftDistincts = new int[N];
        int[] rightDistincts = new int[N];
        HashSet<Integer> leftSet = new HashSet<>();
        HashSet<Integer> rightSet = new HashSet<>();

        while(left < N && right >= 0) {
            leftSet.add(A[left-1]);
            rightSet.add(A[right+1]);

            leftDistincts[left] = leftSet.size();
            rightDistincts[right] = rightSet.size();

            left++;
            right--;
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            ans.add(leftDistincts[i] - rightDistincts[i]);
        }
        return ans;
    }
}
