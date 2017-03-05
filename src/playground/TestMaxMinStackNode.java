package playground;

import exceptions.EmptyStructureException;
import implementations.DequeMaxMinStack;

/**
 * This one tests a stack that can return the min and max element in the 
 * structure, and do all of its operations in 0(1) time.
 * @author Ryan Amaral
 *
 */
public class TestMaxMinStackNode {

    public static void main(String[] args) {
        DequeMaxMinStack<Integer> stack = new DequeMaxMinStack<Integer>();
        
        System.out.println("FOR MAX_STACK:");
        
        System.out.println("Initial: " + stack.toString());
        stack.push(55);
        System.out.println("push(55): " + stack.toString());
        stack.push(23);
        System.out.println("push(23): " + stack.toString());
        stack.push(76);
        System.out.println("push(76): " + stack.toString());
        try {
            stack.pop();
        } catch (EmptyStructureException e) {
            //System.out.println("pop(): error");
        }
        System.out.println("pop(): " + stack.toString());
        stack.push(76);
        System.out.println("push(76): " + stack.toString());
        stack.push(76);
        System.out.println("push(76): " + stack.toString());
        try {
            stack.pop();
        } catch (EmptyStructureException e) {
            //System.out.println("pop(): error");
        }
        System.out.println("pop(): " + stack.toString());
        try {
            stack.pop();
        } catch (EmptyStructureException e) {
            //System.out.println("pop(): error");
        }
        System.out.println("pop(): " + stack.toString());
        try {
            stack.pop();
        } catch (EmptyStructureException e) {
            //System.out.println("pop(): error");
        }
        System.out.println("pop(): " + stack.toString());
        try {
            stack.pop();
        } catch (EmptyStructureException e) {
            //System.out.println("pop(): error");
        }
        System.out.println("pop(): " + stack.toString());
        try {
            stack.pop();
        } catch (EmptyStructureException e) {
            //System.out.println("pop(): error");
        }
        System.out.println("pop(): " + stack.toString());
        try {
            stack.pop();
        } catch (EmptyStructureException e) {
            //System.out.println("pop(): error");
        }
        System.out.println("pop(): " + stack.toString());
        stack.push(-99);
        System.out.println("push(-99): " + stack.toString());
        stack.push(0);
        System.out.println("push(0): " + stack.toString());
    }

}
