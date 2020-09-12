package basics;

import java.util.Scanner;

public class Basics {
	public enum Day { MONDAY, TUESDAY };
	public static void main(String[] args) {
		System.out.println("testing");
		
//		Integer a = Integer.valueOf(1);
//		
//		System.out.println(a);
//		
//		System.out.println("hi".length());
//		
//		int[] arr = {1,2,3};
//		System.out.println(arr.length);
//		
//		System.out.println(Day.MONDAY);
//		
//		int k;
//		int j =  k = 25;
//		System.out.println(j);
//		System.out.println(k);
//		
//		double d = 54;
//		Double d2 = d;
//		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Enter an int");
//		int in = scan.nextInt();
//		
//		System.out.println(in);
//		
//		
//		CreditCard card = new PredatoryCreditCard("cust", "bk", "acnt", 500, 1000, 2.3);
//		card.charge(5);
//		
//		
//		// exceptions
//		
//		int n;
//		
//		try {
//			n = Integer.parseInt(args[0]);
//			if(n <= 0) {
//				System.out.println("Must be positive");
//			}
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(e);
//		}catch(NumberFormatException e) {
//			System.out.println(e);
//		}
		
		
//		Pair<String, Double>[] pairs = new Pair[25];
//		pairs[0] = new Pair<String, Double>("first", 1.0);
		
//		System.out.println(pairs[0].getFirst());
//		System.out.println(pairs[0].getSecond());
		
		ShoppingCart<BoxedItem> sc = new ShoppingCart<>();
		BoxedItem bi = new BoxedItem("description", 20, 10, false);
		sc.test(bi);
	}

}
