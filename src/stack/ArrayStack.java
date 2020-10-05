package stack;

public class ArrayStack<E> implements Stack<E> {
	
	public static final int CAPACITY = 1000;
	private E[] data;
	private int t = -1; // index for top element of stack
	
	public ArrayStack() {
		this(CAPACITY);
	}
	
	public ArrayStack(int capacity) {
		data = (E[]) new Object[capacity];
	}

	@Override
	public int size() {
		return t+1;
	}

	@Override
	public boolean isEmpty() {
		return t == -1;
	}

	@Override
	public void push(E e) {
		if(size() == data.length) {
			throw new IllegalStateException("Stack is full.");
		}
		t = t + 1;
		data[t] = e;
	}

	@Override
	public E pop() {
		if(isEmpty()) return null;
		
		E answer = data[t];
		data[t] = null;
		t = t -1;
		
		return answer;
	}

	@Override
	public E top() {
		if(isEmpty()) return null;
		
		return data[t];
	}

}
