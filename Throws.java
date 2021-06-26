package advance.dev;

public class Throws extends Exception {
 String mess;
	
	public Throws(String mess) {
		super(mess);
		this.mess = mess;
	}
}