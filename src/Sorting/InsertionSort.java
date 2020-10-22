package Sorting;

public class InsertionSort {
	private static int count = 0;
	private int count2 = 0;
	
	public static void insertionSort(char[] data) {
		int n = data.length;
 		
		// loop over all elements starting for second element
		for(int k = 1; k < n; k++) {
			char current = data[k]; // get current element
			int j = k; 
			while(j > 0 && data[j-1] > current) { // check from 0 -> k elements to see if current is bigger or smaller
				data[j] = data[j-1];
				j--;
			}
			data[j] = current;
		}
	}

}


// i code this to remind myself how to do insertion sort

//int[] arr = {1,2};
//for(int i = 1; i<arr.length;i++) {
//	int j = i-1;
//	int current = arr[i];
//	
//	while(j >= 0 && arr[j] > current) {
//		arr[i] = arr[j];
//		i--;
//	}
//	arr[j] = current;
//}