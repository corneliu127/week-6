
public class DeceleratingState implements State {

	private static final long serialVersionUID = 1L;
	transient Engine engine;
	
	public DeceleratingState(Engine engine) {
		this.engine = engine;
	}
	
	@Override
	public void accelerate() {
		
		if (engine.getFuelLevel() > 0 ) {
			System.out.println("We are starting to move forward.!");
			engine.consumeFuel();
			engine.setState(engine.getAcceleratingState());
		} else {
			System.out.println("Out of Fuel! Cannot Accelerate! Engine now off.");
			engine.setState(engine.getOutOfFuelState());
		}
		
	}

	public void decelerate() {
		
		if (engine.getFuelLevel() > 0) {
			System.out.println("We are alreadying faster now!");
			engine.consumeFuel();
		} else {
			System.out.println("Out of Fuel! Cannot Decelerate! Engine now off.");
			engine.setState(engine.getOutOfFuelState());
		}
		


	}

	@Override
	public void idle() {
		System.out.println("Engine stopped decelerating. Now engine is idle!");
		engine.setState(engine.getIdleState());
		

	}

	public String toString() {
		return "moving backwards.";
	}
}
