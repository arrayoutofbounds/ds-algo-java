package Recursion;

public class ArraySum {

	public static void main(String[] args) {
		int[] data = {1,2,3,4,5,6,7,8};
		System.out.println(sum(data, data.length));
	}
	
	public static int sum(int[] data, int n) {
		if(n == 0) {
			return 0;
		}else {
			return sum(data, n-1) + data[n-1];
		}
	}

}
