package implementations;

import adt.Deque;
import adt.Stack;
import exceptions.EmptyStructureException;

/**
 * A stack implementation using a deque.
 * @author Ryan Amaral
 *
 * @param <E>
 */
public class DequeStack<E> implements Stack<E> {
    
    Deque<E> deque; // the backing data structure of this stack
    
    /**
     * Creates a deque based stack of the desired deque type.
     * @param deque The deque to build on.
     */
    public DequeStack(Deque<E> deque){
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
    public E top() throws EmptyStructureException {
        return deque.lastElement();
    }

    @Override
    public E pop() throws EmptyStructureException {
        return deque.removeLast();
    }

    @Override
    public void push(E element) {
        deque.insertLast(element);
    }

    public String toString(){
        return deque.toString();
    }
}