package basics;

public class Photograph implements Sellable {
	
	private String description;
	private int price;
	private boolean colour;
	
	public Photograph(String desc, int p,boolean c) {
		description = desc;
		price = p;
		colour = c;
	}

	@Override
	public String description() {
		return description;
	}

	@Override
	public int listPrice() {
		return price;
	}

	@Override
	public int lowestPrice() {
		return price/2;
	}
	
	public boolean colour() {
		return colour;
	}

}
