package exception;

public class NullStudentObjectException extends Exception{
	/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;
	public NullStudentObjectException () {
		super("NullStudentObjectException occurred");
	}
	public String toString() {
		return "object is null";
	} 
}