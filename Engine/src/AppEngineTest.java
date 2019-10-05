import java.rmi.Naming;

public class AppEngineTest {

	public static void main(String[] args) {
		
		EngineRemote engine = null;
		int count;
		
		if (args.length < 2) {
			System.out.println("Engine <name> <inventory>");
			System.exit(1);
		}
		
		try {
			count = Integer.parseInt(args[1]);
			
			engine = new Engine(args[0], count);
			Naming.rebind("//" + args[0] + "/engine", engine);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		// creating engine with 2 fuel
//		Engine engine = new Engine(2);
//		
//		System.out.println(engine);
//		
//		engine.accelerate();
//		engine.idle();
//		engine.decelerate();
//		engine.accelerate();
//		engine.decelerate();
//		engine.idle();
//		System.out.println(engine);
//		
//		// refueling the engine with 5 fuel
//		engine.refill(5);
//		System.out.println(engine);
//		
//		engine.accelerate();
//		engine.decelerate();
//		engine.accelerate();		
//		
//		System.out.println(engine);
		

	}

}
