package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		Set<Integer> linkedSet = new LinkedHashSet<>();
		Set<Integer> treeSet = new TreeSet<>();
		
		set.add(Integer.valueOf(1));
		set.add(Integer.valueOf(5));
		set.add(Integer.valueOf(4));
		set.add(Integer.valueOf(3));
		
		linkedSet.add(Integer.valueOf(3));
		linkedSet.add(Integer.valueOf(4));
		linkedSet.add(Integer.valueOf(1));
		linkedSet.add(Integer.valueOf(2));
		
		treeSet.add(Integer.valueOf(4));
		treeSet.add(Integer.valueOf(3));
		treeSet.add(Integer.valueOf(2));
		treeSet.add(Integer.valueOf(1));
		
		for(int i : set) {
			System.out.println(i);
		}
		
		System.out.println("\n");
		
		for(int i : linkedSet) {
			System.out.println(i);
		}
		
		System.out.println("\n");
		
		for(int i : treeSet) {
			System.out.println(i);
		}
	}
}
