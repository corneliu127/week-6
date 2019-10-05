
public class OutOfFuelState implements State {

	private static final long serialVersionUID = 1L;
	transient Engine engine;
	
	public OutOfFuelState(Engine engine) {
		this.engine = engine;
	}
	
	@Override
	public void accelerate() {
		System.out.println("Unable to accelerate. Out of Fuel!");

	}

	@Override
	public void decelerate() {
		System.out.println("Unable to decelerate. Out of Fuel!");

	}

	@Override
	public void idle() {
		System.out.println("Enginge is off. There is no Fuel!");
				
	}

	public String toString() {
		return "now off.";
	}
}
