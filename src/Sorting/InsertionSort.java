package Sorting;

public class InsertionSort {
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
