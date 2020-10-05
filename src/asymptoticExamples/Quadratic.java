package asymptoticExamples;

import java.util.Arrays;

public class Quadratic {

	public static void main(String[] args) {
		
	}
	
	// checking that value is unique in all sets. O(n^3)
	private static boolean disjoint1(int[] A, int[] B, int[] C) {
		for(int a: A) {
			for(int b: B) {
				for(int c : C) {
					if((a==b)&&(a==c)) {
						return false;
					}
				}
			}
		}
		return true;
	}
	
	// checking that value is unique in all sets. O(n^2)
		private static boolean disjoint2(int[] A, int[] B, int[] C) {
			for(int a: A) {
				for(int b: B) {
					if(a == b)
						for(int c : C) {
							if((a==c)) {
								return false;
							}
						}
				}
			}
			return true;
		}
		
		// returns true if no duplicate elements in array O(n^2)
		private static boolean unique1(int[] data) {
			int n = data.length;
			for(int j = 0; j< n-1; j++) {
				for(int k = j+1; k < n; k++) {
					if(data[j] == data[k]) {
						return false;
					}
				}
			}
			return true;
		}
		
		// returns true if no duplicate elements in array. O(nlogn) since sorting is nlogn and finding is just n. So nlogn + n = big oh of nlogn
		private static boolean unique2(int[] data) {
			int n = data.length;
			int[] temp = Arrays.copyOf(data, n);
			Arrays.sort(temp);
			for(int j = 0; j< n-1; j++) {
				if(temp[j] == temp[j+1]) {
					return false;
				}
			}
			return true;
		}
		
		// total = 1 + n + n + n^2 + n^2 + n = 2n^2 + 3n +1 = O(n^2)
		private static double[] prefixAverage1(double[] x) {
			int n = x.length; // O(1)
			double[] a = new double[n]; //O(n)
			for(int j = 0; j < n; j++) {
				double total = 0; // O(n)
				for (int i = 0; i <= j; i++) { // 1 + 2 + 3 + 4 +.... n.. so (n(n+1)/2
					total += x[i]; //(n(n+1)/2
				}
				a[j] = total / j+1; //O(n)
			}
			return a;
		}
		
		// total = 1 + n + n + n + n = 4n +1 = O(n)
		private static double[] prefixAverage2(double[] x) {
			int n = x.length; // O(1)
			double[] a = new double[n]; //O(n)
			double total = 0; // O(1)
			for(int j = 0; j < n; j++) { //O(n)
				total += x[j]; //O(n)
				a[j] = total/(j+1); //O(n)
			}
			return a;
		}
}
