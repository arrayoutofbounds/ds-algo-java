package queue;

import Lists.CircularLinkedList;

public class LinkedCircularQueue<E> implements CircularQueue<E> {
	
	private CircularLinkedList<E> list;
	
	public LinkedCircularQueue() {
		list = new CircularLinkedList<>();
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public void enqueue(E e) {
		list.addLast(e);
	}

	@Override
	public E first() {
		return list.first();
	}

	@Override
	public E dequeue() {		
		return list.removeFirst();
	}

	@Override
	public void rotate() {
		list.rotate();
	}

}
