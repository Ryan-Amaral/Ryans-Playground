package exceptions;

/**
 * Should be thrown when an operation is performed on an empty data structure
 * that cannot be performed on an empty data structure.
 * @author Ryan Amaral
 *
 */
@SuppressWarnings("serial")
public class EmptyStructureException extends Exception {
    
    public EmptyStructureException() { super(); }
    public EmptyStructureException(String s) { super(s); }
}
