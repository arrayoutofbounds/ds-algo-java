package Recursion;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a int for factorial");
		int i = scanner.nextInt();
		
		System.out.println(factorial(i));
	}
	
	public static int factorial(int n) throws IllegalArgumentException{
		if(n < 0) {
			throw new IllegalArgumentException();
		}else if (n == 0) {
			return 1;
		}else {
			return n * factorial(n-1);
		}
	}
}
