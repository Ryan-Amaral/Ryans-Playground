package implementations;

import java.util.Iterator;
import java.util.LinkedList;

import adt.Deque;
import exceptions.EmptyStructureException;

/**
 * A deque implemented using a linked list.
 * @author Ryan Amaral
 *
 * @param <E>
 */
public class LinkedListDeque<E> implements Deque<E> {
    
    LinkedList<E> elements;

    /**
     * Creates a new linked list deque with an empty list
     */
    public LinkedListDeque(){
        elements = new LinkedList<E>();
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public void insertFirst(E element) {
        elements.add(0, element);
    }

    @Override
    public void insertLast(E element) {
        elements.add(elements.size(), element);
    }

    @Override
    public E removeFirst() throws EmptyStructureException {
        if(elements.isEmpty()) throw new EmptyStructureException();
        return elements.removeFirst();
    }

    @Override
    public E removeLast() throws EmptyStructureException {
        if(elements.isEmpty()) throw new EmptyStructureException();
        return elements.removeLast();
    }

    @Override
    public E firstElement() throws EmptyStructureException {
        if(elements.isEmpty()) throw new EmptyStructureException();
        return elements.getFirst();
    }

    @Override
    public E lastElement() throws EmptyStructureException {
        if(elements.isEmpty()) throw new EmptyStructureException();
        return elements.getLast();
    }
    
    public String toString(){
        String str = "{"; // the string to return
        Iterator<E> iterator = elements.iterator();
        while(iterator.hasNext()){
            str += iterator.next().toString();
            if(iterator.hasNext())
                str += ",";
        }
        str += "}";
        return str;
    }
}