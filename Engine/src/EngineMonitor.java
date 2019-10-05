import java.rmi.*;

public class EngineMonitor {
	EngineRemote machine;
	
	public EngineMonitor(EngineRemote machine) {
		this.machine = machine;
	}
	
	
	public void report() {
		try {
			System.out.println("Engine: " + machine.getLocation());
			System.out.println("Current fuel " + machine.getFuel());
			System.out.println("Current state: " + machine.getState());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
