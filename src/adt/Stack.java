package adt;

import exceptions.EmptyStructureException;

/**
 * A stack interface.
 * @author Ryan Amaral
 *
 * @param <E>
 */
public interface Stack<E> {
    
    /**
     * @return The size of the stack.
     */
    public int size();
    
    /**
     * @return Whether the stack is empty.
     */
    public boolean isEmpty();
    
    /**
     * Returns and does not remove the object on the top of the stack.
     * @return The object on the top of the stack.
     */
    public E top() throws EmptyStructureException;
    
    /**
     * Returns and removes the object on the top of the stack.
     * @return The object on the top of the stack.
     */
    public E pop() throws EmptyStructureException;
    
    /**
     * Pushes the specified object to the top of the stack.
     * @param element The object to be pushed onto the stack.
     */
    public void push(E element);
}
