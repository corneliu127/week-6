
public class AcceleratingState implements State {

	Engine engine;
	
	public AcceleratingState(Engine engine) {
		this.engine = engine;
	}
	
	
	public void accelerate() {
		
		if (engine.getFuelLevel() > 0) {
			System.out.println("We are moving faster now!");
			engine.consumeFuel();			
		} else {
			System.out.println("Out of Fuel! Cannot Accelerate! Engine is now off!");
			engine.setState(engine.getOutOfFuelState());
			}
	}

	@Override
	public void decelerate() {
		if (engine.getFuelLevel() > 0) {		
		System.out.println("We are slowing down....");
		engine.consumeFuel();
		engine.setState(engine.getDeceleratingState());
		} else {
			System.out.println("Out of Fuel! Cannot Decelerate! Engine now off.");
			engine.setState(engine.getOutOfFuelState());
		}

	}

	@Override
	public void idle() {
		System.out.println("Engine is now idle.");
		engine.setState(engine.getIdleState());		

	}
	
	public String toString() {
		return "moving forward.";
	}

}
