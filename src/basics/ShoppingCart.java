package basics;

public class ShoppingCart<T extends Sellable> {
	private T t;
	
	public void test(T t) { 
		this.t = t;
		
		System.out.println(this.t.description());
	}
}
