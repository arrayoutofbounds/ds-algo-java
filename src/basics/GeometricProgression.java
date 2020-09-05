package basics;

public class GeometricProgression extends Progression {
	protected long base;
	
	public GeometricProgression() {
		this(2,0);
	}
	
	public GeometricProgression(long b) {
		this(b, 0);
	}
	
	public GeometricProgression(long b, long start) {
		super(start);
		base = b;
	}
	
	protected void advance() {
		current *= base;
	}
}
