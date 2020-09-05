package basics;

import java.util.Scanner;

public class Basics {
	public enum Day { MONDAY, TUESDAY };
	public static void main(String[] args) {
		System.out.println("testing");
		
		Integer a = Integer.valueOf(1);
		
		System.out.println(a);
		
		System.out.println("hi".length());
		
		int[] arr = {1,2,3};
		System.out.println(arr.length);
		
		System.out.println(Day.MONDAY);
		
		int k;
		int j =  k = 25;
		System.out.println(j);
		System.out.println(k);
		
		double d = 54;
		Double d2 = d;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an int");
		int in = scan.nextInt();
		
		System.out.println(in);
		
		
		CreditCard card = new PredatoryCreditCard("cust", "bk", "acnt", 500, 1000, 2.3);
		card.charge(5);
	}

}
