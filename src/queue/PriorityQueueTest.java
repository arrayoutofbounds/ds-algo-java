package queue;

import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		PriorityQueue<String> q = new PriorityQueue<String>();
		
		q.offer("c");
		q.offer("a");
		q.offer("b");
		
		System.out.println(q.poll());
		System.out.println(q.size());
		
		
		PriorityQueue<Integer> q2 = new PriorityQueue<>();
		
		q2.offer(2);
		q2.offer(1);
		q2.offer(3);
		
		System.out.println(q2.poll());
		System.out.println(q2.size());
	}

}
