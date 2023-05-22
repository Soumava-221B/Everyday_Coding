/*
Write a Java program to sort an array of given integers using the Heap sort algorithm.

In computer science heapsort (invented by J. W. J. Williams in 1964) is a comparison-based sorting algorithm. Heapsort can be thought of as an improved selection sort: like that algorithm, it divides its input into a sorted and an unsorted region, and it interactively shrinks the unsorted region by extracting the largest element and moving that to the sorted region. The improvement consists of the use of a heap data structure rather than a linear-time search to find the maximum. Although somewhat slower in practice on most machines than a well-implemented quicksort, it has the advantage of a more favorable worst-case O(n log n) runtime. Heapsort is an in-place algorithm, but not a stable sort.

A run of the heapsort algorithm sorting an array of randomly permuted values. In the first stage of the algorithm the array elements are reordered to satisfy the heap property. Before the actual sorting takes place, the heap tree structure is shown briefly for illustration.*/

public class HeapSort
{
public static void heapSort(int[] a){
	int count = a.length;
	//first place a in max-heap order
	heapify(a, count);
	int end = count - 1;
	while(end > 0){
		int tmp = a[end];
		a[end] = a[0];
		a[0] = tmp;
		siftDown(a, 0, end - 1);
		end--;
	}
}
public static void heapify(int[] a, int count){
	
	int start = (count - 2) / 2; 
	while(start >= 0){
		siftDown(a, start, count - 1);
		start--;
	}
	//after sifting down the root all nodes/elements are in heap order
}
public static void siftDown(int[] a, int start, int end){
	//end represents the limit of how far down the heap to sift
	int root = start;
	while((root * 2 + 1) <= end){      
		int child = root * 2 + 1;           
		if(child + 1 <= end && a[child] < a[child + 1])
			child = child + 1;           
		if(a[root] < a[child]){     
			int tmp = a[root];
			a[root] = a[child];
			a[child] = tmp;
			root = child;                
		}else
			return;
	}
}
// Driver program
	public static void main(String args[])
	{
		int arr[] = {7, -5, 3, 2, 1, 0, 45};
		int n = arr.length;
		HeapSort ob = new HeapSort();
		ob.heapSort(arr);
        System.out.println();
		System.out.print("Sorted array:");
		 for (int element: arr) {
            System.out.print(" "+element);
        }
        System.out.println();
	}
}