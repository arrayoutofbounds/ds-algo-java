package maths;

public class Prime {
	public static void main(String[] args) {
		System.out.println(isPrime(-0));
		System.out.println(isPrime(0));
		System.out.println(isPrime(1));
		
		System.out.println(isPrime(2));
		System.out.println(isPrime(57));
		System.out.println(isPrime(59));
	}
	
	private static boolean isPrime(int n) {
		if(n <= 0) {
			return false;
		}
		
		if(n ==2) {
			return true;
		}
		
		for(int j = 3; j * j <= n; j++) {
			if(n % j == 0) {
				return false;
			}
		}
		return true;
	}
}
