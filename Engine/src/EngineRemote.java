import java.rmi.*;

public interface EngineRemote extends Remote{

	public int getFuel() throws RemoteException;
	public String getLocation() throws RemoteException;
	public State getState() throws RemoteException;
}
