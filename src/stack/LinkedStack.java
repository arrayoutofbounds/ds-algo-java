package stack;

import Lists.LinkedList;

public class LinkedStack<E> implements Stack<E> {
	
	private LinkedList<E> list = new LinkedList<>();
	
	public LinkedStack() {}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public void push(E e) {
		list.addFirst(e);
	}

	@Override
	public E pop() {
		return list.removeFirst();
	}

	@Override
	public E top() {
		return list.first();
	}

}
