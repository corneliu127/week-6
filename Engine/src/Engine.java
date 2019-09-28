
public class Engine {

	State outOfFuelState;
	State idleState;
	State acceleratingState;
	State deceleratingState;
	
	State state = outOfFuelState;
	int fuel = 0;
	
	public Engine(int fuel ) {
		outOfFuelState = new OutOfFuelState(this);
		idleState = new IdleState(this);
		acceleratingState = new AcceleratingState(this);
		deceleratingState = new DeceleratingState(this);
		
		this.fuel = fuel;
		if (fuel > 0) {
			state = idleState;
		}
	}
	
	public void accelerate() {
		state.accelerate();
	}
	
	public void decelerate() {
		state.decelerate();
	}
	
	public void idle() {
		state.idle();
	}
	
	void setState(State state) {
		this.state = state;
	}
	
	void consumeFuel() {
		System.out.println("A fuels has been consumed.");
		if (fuel !=0) {
			fuel = fuel -1;
		}
	}
	
	int getFuelLevel() {
		return fuel;
	}
	
	void refill(int fuel) {
		this.fuel = fuel;
		System.out.println("Engine has been refueld with " + fuel + " fuel.");
		state = idleState;
	}
	
	public State getOutOfFuelState() {
		return outOfFuelState;
	}
	
	public State getAcceleratingState() {
		return acceleratingState;
	}
	
	public State getDeceleratingState() {
		return deceleratingState;
	}
	
	public State getIdleState() {
		return idleState;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nEngine Status\n----------------- ");
		result.append("\nFuel level: " + fuel);
		
		result.append("\n");
		result.append("Engine is " + state + "\n");
		return result.toString();
	}
	
	
}
