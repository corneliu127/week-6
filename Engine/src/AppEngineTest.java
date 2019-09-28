
public class AppEngineTest {

	public static void main(String[] args) {
		
		// creating engine with 2 fuel
		Engine engine = new Engine(2);
		
		System.out.println(engine);
		
		engine.accelerate();
		engine.idle();
		engine.decelerate();
		engine.accelerate();
		engine.decelerate();
		engine.idle();
		System.out.println(engine);
		
		// refueling the engine with 5 fuel
		engine.refill(5);
		System.out.println(engine);
		
		engine.accelerate();
		engine.decelerate();
		engine.accelerate();		
		
		System.out.println(engine);
		

	}

}
