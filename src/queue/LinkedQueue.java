package queue;

import Lists.LinkedList;

public class LinkedQueue<E> implements Queue<E> {
	
	private LinkedList<E> list = new LinkedList<>();
	
	public LinkedQueue() {
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

}
