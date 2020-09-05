package basics;

public class BoxedItem implements Sellable, Transportable {
	private String descript; // description of this item
	private int price; // list price in cents
	private int weight; // weight in grams
	private boolean haz; // true if object is hazardous
	private int height=0; // box height in centimeters
	private int width=0; // box width in centimeters
	private int depth=0;
	
	public BoxedItem(String desc, int p, int w, boolean h) {
		descript = desc;
		price = p;
		weight = w;
		haz = h;
	}

	@Override
	public int weight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isHazardous() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int listPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lowestPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void setBox(int h, int w, int d) {
		height = h;
		width = w;
		depth = d;
	}

}
