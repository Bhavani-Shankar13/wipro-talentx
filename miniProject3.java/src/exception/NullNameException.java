package exception;

public class NullNameException extends Exception{
	/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;
	public NullNameException() {
        super("NullNameException occurred");
    }
	public String toString() {
		
		return "name is null";
	}
}