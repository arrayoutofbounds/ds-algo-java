package Sorting;

import java.util.Arrays;

public class Bubble {
	
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void bubbleSort(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
				}
			}
		}
	}
	
	public static void bubbleSortOptimised(int[] arr) {
		boolean swapped;
		for(int i = 0; i < arr.length-1; i++) {
			swapped = false;
			for(int j = 0; j < arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
					swapped = true;
				}
			}
			if(swapped == false) break;
		}
	}
	
	public static void main(String[] args) {
		int[] a = new int[] {5,3,4,1,-2};
		long start = System.currentTimeMillis();
		bubbleSort(a);
		long end = System.currentTimeMillis();
		System.out.println(Arrays.toString(a) + " in " + (end-start));
		
		int[] b = new int[] {5,3,4,1,-2};
		long start2 = System.currentTimeMillis();
		bubbleSort(b);
		long end2 = System.currentTimeMillis();
		System.out.println(Arrays.toString(b) + " in " + (end2-start2));
	}

}



// test myself on how to code bubble sort without looking

//for(int i = 0; i < arr.length-1; i--) {
//	swapped = false;
//	for(int k = 0; k < arr.length-i-1; k++) {
//		if(arr[k] > arr[i]) {
//			swap(i,k);
//			swapped = true;
//		}
//	}
//	if !swapped break;
//}