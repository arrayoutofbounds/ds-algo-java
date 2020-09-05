package basics;

public class FibProgression extends Progression {
	protected long prev;
	
	public FibProgression() {
		this(0,1);
	}
	
	public FibProgression(long first, long second) {
		super(first);
		prev = second - first;
	}
	
	protected void advance() {
		long temp = prev;
		prev = current;
		current += temp;
	}
}
