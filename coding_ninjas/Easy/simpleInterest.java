import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
		long principal = sc.nextInt();
		double rate = sc.nextDouble();
		long time = sc.nextInt();
        
		double si = (principal*rate*time)/100;
		System.out.print((int)si);
		
		sc.close();
	}
}