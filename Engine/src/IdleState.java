
public class IdleState implements State {
	
	private static final long serialVersionUID = 1L;
	Engine engine;
	
	public IdleState(Engine engine) {
		this.engine = engine;
	}

	
	public void accelerate() {
		
		if (engine.getFuelLevel() > 0) {
			System.out.println("We are starting to move forward!");
			engine.consumeFuel();
			engine.setState(engine.getAcceleratingState());
		} else {
			System.out.println("Out of Fuel! Cannot Accelerate! Engine now off.");
			engine.setState(engine.getOutOfFuelState());
		}
		
	}


	public void decelerate() {
		
		if (engine.getFuelLevel() > 0 ) {
			System.out.println("We are starting to move backward!");
			engine.consumeFuel();
			engine.setState(engine.getDeceleratingState());
		} else {
			System.out.println("Out of Fuel! Cannot Decelerate! Engine now off.");
			engine.setState(engine.getOutOfFuelState());
		}
		
	}

	public void idle() {
		System.out.println("Engine idle.");

	}
	
	public String toString() {
		return "now idle.";
	}

}
