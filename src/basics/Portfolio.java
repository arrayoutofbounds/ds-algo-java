package basics;

public class Portfolio<T> {
	T[] data;
	public Portfolio(int capacity) {
		data = (T[]) new Object[capacity];
	}
	
	public T getIndex(int index) {
		return data[index];
	}
	
	public void set(int index, T element) {
		data[index] = element;
	}
}
