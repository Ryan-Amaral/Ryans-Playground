package implementations;

/**
 * A node for the MaxMinStack. Treating it like a c struct.
 * @author Ryan Amaral
 *
 * @param <E>
 */
public class MaxMinStackNode<E> {

    public E Max;
    public E Min;
    public E Val;
    
    public String toString(){
        return Val.toString();
    }
}
