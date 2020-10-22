package map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();
		
		map.put(10, 10);
		map.put(3, 4);
		map.put(4, 5);
		map.put(1, 1);
		map.put(2, 2);
		
		
		map2.put(10, 10);
		map2.put(3, 4);
		map2.put(4, 5);
		map2.put(1, 1);
		map2.put(2, 2);
		
		
		for(int v : map.values()) {
			System.out.println(v);
		}
		System.out.println("\n");
		for(int v : map2.values()) {
			System.out.println(v);
		}
	}

}
