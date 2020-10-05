package Recursion;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = {1,2,3};
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		reverse(a, 0, a.length-1);
		reverse(b, 0, b.length-1);
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		reassign(a);
		System.out.println(Arrays.toString(a));

	}

	// O(n)
	public static void reverse(int[] data, int low, int high) {
		if(low <= high) {
			int temp = data[low];
			data[low] = data[high];
			data[high] = temp;
			reverse(data, low+1, high-1);
		}
	}
	
	public static void reassign(int[] c) {
//		c = new int[10]; does not work
		// c[0] = 123123; works
	}
}
