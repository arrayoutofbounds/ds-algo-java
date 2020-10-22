package queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class TestJavaQueue {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		
		q.add("s");
		q.offer("d");
		q.poll();
		
		System.out.println(q.toString());
		
		
		Queue<String> q2 = new ArrayDeque<>();
		
		q2.add("s");
		q2.offer("d");
		q2.poll();
		
		System.out.println(q2.toString());
	}

}
