package implementations;

import adt.Deque;
import adt.Stack;
import exceptions.EmptyStructureException;

/**
 * A stack that performs all stack tasks including return the max and min
 * elements in the structure. All of which are performed in O(1) time.
 * @author Ryan Amaral
 *
 * @param <E>
 */
public class DequeMaxMinStack<E> implements Stack<E> {

    Deque<MaxMinStackNode<E>> deque; // the backing data structure
    
    /**
     * Create new DequeMaxMinStack on the specified deque type. defaults
     * to LinkedListDeque.
     * @param deque
     */
    /*public DequeMaxMinStack(Deque<E> deque){
        try {
            // never tried this before, sure hope it works
            Class clazz = deque.getClass().newInstance();
            this.deque = new clazz<E>();
            this.deque = deque.getClass().newInstance<E>();
        } catch (InstantiationException | IllegalAccessException e) {
            // just use LinkedListDeque
            this.deque = new LinkedListDeque<MaxMinStackNode<E>>();
        }
    }
    I must figure out how to get the type of deque to base my this.deque on.
    */
    
    /**
     * Create new DequeMaxMinStack built off of LinkedListDeque.
     */
    public DequeMaxMinStack() {
        this.deque = new LinkedListDeque<MaxMinStackNode<E>>();
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
        if(isEmpty()) throw new EmptyStructureException();
        return deque.lastElement().Val;
    }

    @Override
    public E pop() throws EmptyStructureException {
        if(isEmpty()) throw new EmptyStructureException();
        E val = deque.lastElement().Val;
        deque.removeLast();
        return val;
    }
    
    /**
     * Internal use top method to get top node, not just value.
     * @return
     * @throws EmptyStructureException 
     */
    private MaxMinStackNode<E> iTop() throws EmptyStructureException{
        if(isEmpty()) throw new EmptyStructureException();
        return deque.lastElement();
    }

    @Override
    public void push(E element) {
        // create new node
        MaxMinStackNode<E> node = new MaxMinStackNode<>();
        node.Val = element;
        // this is first node so all is element
        if(deque.isEmpty()){
            node.Max = element;
            node.Min = element;
        }
        else{ // have to compare with top for max and min
            
            /* !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
             * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
             * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
             * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
             * I NEVER USED TO DISRESPECT JAVA, BUT I JUST FOUND OUT THAT 
             * YOU CANNOT OVERLOAD OPERATORS! THIS WHOLE THING WAS A WASTE 
             * OF TIME, IT WILL NOT WORK!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
             * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
             * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
             * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
             * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
             * */
            
            // major bullshit code alert here, since you cannot overload
            // operators I'm just gonna cast to int, otherwise just
            // make all new entries max and min.
            
            try{
                if((int)element > (int)iTop().Max)
                    node.Max = (E)element;
                else
                    node.Max = iTop().Max;
                
                if((int)element < (int)iTop().Min)
                    node.Min = (E)element;
                else
                    node.Min = iTop().Min;
            }
            catch(Exception e){
                node.Max = element;
                node.Min = element;
            }
        }
        
        deque.insertLast(node);
    }

    /**
     * @return The max element in the structure.
     */
    public E max() throws EmptyStructureException {
        if(isEmpty()) throw new EmptyStructureException();
        return iTop().Max;
    }
    
    /**
     * @return The min element in the structure.
     * @throws EmptyStructureException
     */
    public E min() throws EmptyStructureException {
        if(isEmpty()) throw new EmptyStructureException();
        return iTop().Min;
    }
    
    public String toString(){
        String str;
        try {
            str = "{Max: " + iTop().Max.toString() + 
            ", Min: " + iTop().Min.toString() + 
            "}" + 
            deque.toString();
        } catch (EmptyStructureException e) {
            return "{Max: -, Min: -}{}";
        }
        return str;
    }
}
