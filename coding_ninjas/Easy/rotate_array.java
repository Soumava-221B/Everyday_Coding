import java.util.* ;
import java.io.*; 
class rotate_array {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");  
		int n  = sc.nextInt();
		int[] arr = new int[n];
        System.out.println("Enter the numbers in the array: ");  
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
        
        System.out.println("Enter the number of times an array should be rotated: ");  
	    int k = sc.nextInt();

		// Rotate the given array by k times towards left
		for(int i=0; i<k; i++) {
           int j, first;

		   first = arr[0];
		   for(j=0; j<arr.length-1; j++) {
			   arr[j] = arr[j+1];
		   }
		   arr[j] = first;
		}
        System.out.println("Array after left rotation: ");  
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
        System.out.println();
	}
}