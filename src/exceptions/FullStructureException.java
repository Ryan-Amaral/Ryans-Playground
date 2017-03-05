package exceptions;

/**
 * Should be thrown when an operation is performed on a full data structure
 * that cannot be performed on a full data structure.
 * @author Ryan Amaral
 *
 */
@SuppressWarnings({ "serial" })
public class FullStructureException extends RuntimeException {

    public FullStructureException() {super();}
    public FullStructureException(String s) {super(s);}
}