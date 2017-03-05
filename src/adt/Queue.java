package adt;

import exceptions.EmptyStructureException;

/**
 * A queue interface.
 * @author Ryan Amaral
 *
 * @param <E>
 */
public interface Queue<E> {
    
    /**
     * @return The amount of elements in the queue.
     */
    public int size();
    
    /**
     * @return Whether the queue is empty.
     */
    public boolean isEmpty();
    
    /**
     * @return The object at the front of the queue.
     */
    public E front() throws EmptyStructureException;
    
    /**
     * Inserts an element into the end queue.
     * @param element The element to insert.
     */
    public void enqueue(E element);
    
    /**
     * Removes and returns the object at the front of the queue.
     * @return The object at the front of the queue.
     */
    public E dequeue() throws EmptyStructureException;
}
