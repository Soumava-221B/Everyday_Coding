import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
		long s, e, w;
		s = sc.nextLong();
		e = sc.nextLong();
		w = sc.nextLong();
		
		for(long f = s; f <= e; f += w) {
			long c = (f - 32) * 5/9;
			System.out.println(f + " " + c);
		}
	}
}