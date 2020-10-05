package Recursion;

import java.util.Arrays;

public class Fib {

	public static void main(String[] args) {
//		long start1 = System.currentTimeMillis();
//		System.out.println(badFib(40));
//		long end1 = System.currentTimeMillis();
//		long elapsed = end1 - start1;
//		
//		System.out.println(elapsed);
//		
//		
//		long start2 = System.currentTimeMillis();
//		long[] r = goodFib(40);
//		System.out.println(r[0] + r[1]);
//		long end2 = System.currentTimeMillis();
//		
//		long elapsed2 = end2 - start2;
//		
//		System.out.println(elapsed2);
		System.out.println(badFib(3));
		System.out.println(Arrays.toString(goodFib(3)));
	}
	
	// 2^n in time
	public static long badFib(int n) {
		if(n == 0) {
			return 0;
		}else if(n==1) {
			return 1;
		}else {
			return badFib(n-1) + badFib(n-2);
		}
	}
	
	// n complexity in time
	public static long[] goodFib(int n) {
		if(n<=1) {
			long[] answer = {n,0};
			return answer;
		}else {
			long[] temp = goodFib(n-1);
			long[] answer = {temp[0] + temp[1], temp[0]};
			return answer;
		}
	}

}
