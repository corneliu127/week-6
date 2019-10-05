import java.io.*;

public interface State extends Serializable{

	public void accelerate();
	public void decelerate();
	public void idle();
	
}
