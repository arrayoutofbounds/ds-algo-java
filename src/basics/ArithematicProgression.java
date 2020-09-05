package basics;

public class ArithematicProgression extends Progression {
	protected long increment;
	
	public ArithematicProgression() {
		this(1,0);
	}
	
	public ArithematicProgression(long stepsize) {
		this(stepsize, 0);
	}
	
	public ArithematicProgression(long stepsize, long start) {
		super(start);
		increment = stepsize;
	}
	
	// override inherited method
	protected void advance() {
		current += increment;
	}
}
