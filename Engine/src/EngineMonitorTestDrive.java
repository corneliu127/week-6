import java.rmi.*;

public class EngineMonitorTestDrive {

	public static void main(String[] args) {
		
		String[] location = {	"rmi://earth.engine.com/engine",
								"rmi://mars.engine.com/engine"};
			
	EngineMonitor[] monitor = new EngineMonitor[location.length];

	for (int i=0; i<location.length; i++) {
		try {
			EngineRemote machine = 
					(EngineRemote) Naming.lookup(location[i]);
			monitor[i] = new EngineMonitor(machine);
			System.out.println(monitor[i]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	for (int i=0; i < monitor.length; i++) {
		monitor[i].report();
	}
	}

}
