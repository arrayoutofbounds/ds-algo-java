package Lists;

public class LinkedList<E> {
	private static class Node<E>{
		private E element;
		private Node<E> next;
		
		public Node(E e, Node<E> n) {
			element = e;
			next = n;
		}
		
		public E getElement() { return element; }
		public Node<E> getNext() { return next; }
		public void setNext(Node<E> n) {
			next = n;
		}
	}
	
	private Node<E> head = null;
	private Node<E> tail = null;
	private int size = 0;
	
	public LinkedList() {	}
	
	public int size() { return size; }
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public E first() {
		if(isEmpty()) return null;
		return head.getElement();
	}
	
	public E last() {
		if(isEmpty()) return null;
		return tail.getElement();
	}
	
	public void addFirst(E element) {
		Node<E> node = new Node<>(element, head);
		head = node;
		if(size == 0) tail = head;
		size++;
	}
	
	public void addLast(E element) {
		Node<E> node = new Node<>(element, null);
		if(isEmpty()) {
			head = node;
		}else {
			tail.setNext(node);
		}
		
		tail = node;
		size++;
	}
	
	public E removeFirst() {
		if(isEmpty()) return null;
		E elementToReturn = head.getElement();
		
		head = head.getNext();
		size--;
		
		if(size == 0) {
			tail = null;
		}
		return elementToReturn;
	}
	
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.addFirst("hello");
		list.addLast("world");
		
		list.removeFirst();
		System.out.println(list.first());
	}
}
