package basics;

import java.util.ArrayList;

import java.util.ArrayDeque;


public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//
//class Test<E> {
//	public static <E> E test() {
//		E e2 = new E();
//		E[] e = new E[10]; // cannot do this since type erasure makes it Object[];
//	}
//}


class TestGenerics<T extends Number & Comparable & Cloneable>{
//	static <?>  pan(? a){
//		
//	}
	
//	public <? extends Animal> void takeThing(ArrayList<?> list) {
//		
//	}
	
	
	public <E extends T> void testing(ArrayList<? extends T> t) {
		ArrayList<? extends Number> l = new ArrayList<>();
//		l.add("s");
		l.add(1, null);
		
		ArrayList<?> li = new ArrayList<E>();
	}
	
	
	
}