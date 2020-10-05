package Recursion;

public class Power {

	public static void main(String[] args) {
		System.out.println(power(2,3));
		System.out.println(power2(2,3));
	}
	
	// O(n) time and space
	public static double power(double base, int n) {
		if(n == 0) {
			return 1;
		}else {
			return base * power(base, n-1);
		}
	}
	
	// O(logn) time and space
	public static double power2(double base, int n) {
		if(n == 0) {
			return 1;
		}else {
			double partial = power(base, n/2);
			double result = partial * partial;
			if(n % 2 == 1) {
				result *= base;
			}
			return result;
		}
	}
}
