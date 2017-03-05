package implementations;

import adt.Deque;
import adt.Queue;
import exceptions.EmptyStructureException;

/**
 * A queue implementation using a deque.
 * @author Ryan Amaral
 *
 * @param <E>
 */
public class DequeQueue<E> implements Queue<E> {
    
    Deque<E> deque; // the backing data structure of this queue
    
    /**
     * Creates a deque based queue with the specified dequeue type.
     * @param deque The deque to build on.
     */
    public DequeQueue(Deque<E> deque){
        this.deque = deque;
    }

    @Override
    public int size() {
        return deque.size();
    }

    @Override
    public boolean isEmpty() {
        return deque.isEmpty();
    }

    @Override
    public E front() throws EmptyStructureException {
        return deque.lastElement();
    }

    @Override
    public void enqueue(E element) {
        deque.insertFirst(element);
    }

    @Override
    public E dequeue() throws EmptyStructureException {
        return deque.removeLast();
    }

    public String toString(){
        return deque.toString();
    }
}