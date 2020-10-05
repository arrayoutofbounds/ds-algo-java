package Recursion;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(binarySearch(arr, 13, 0 , arr.length-1));
	}
	
	// tail recursion
	public static boolean binarySearch(int[] data, int target, int low, int high) {
		if(low > high) {
			return false;
		}else {
			int mid = (low+high)/2;
			int val = data[mid];
			
			if(val == target) {
				return true;
			}else if(target < val) {
				return binarySearch(data, target, low ,mid-1);
			}else{
				return binarySearch(data, target, mid+1 , high);
			}
		}
	}
	
	// convert to iterative
	public static boolean iterBinarySearch(int[] data, int target) {
		int low = 0;
		int high = data.length -1;
		while(low <= high) {
			int mid = (low + high)/2;
			if(target == data[mid]) {
				return true;
			}else if(target < data[mid]) {
				high = mid - 1;
			}else {
				low = mid + 1;
			}
		}
		return false;
	}

}
