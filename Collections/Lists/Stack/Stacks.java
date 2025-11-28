package Collections.Lists.Stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {

        // =================================================================================
       
        // creating stack
        Stack<Integer> stack1 = new Stack<>();

        // ===============================================================================

        // adding elements
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);

        // =============================================================================

        // accessing by last element
        System.out.println(stack1.peek()); //4

        // =============================================================================

        System.out.println(stack1.isEmpty()); //false
        System.out.println(stack1.size()); //4

        // =============================================================================
    
        // printing the stack
        System.out.println(stack1); //[1,2,3,4]

        // ============================================================================

        // searching an element in stack
        System.out.println(stack1.search(1)); //search method is a 1 based indexing output is 4

        // ============================================================================

        // removing element
        System.out.println(stack1.pop()); //removes last element i.e. 4

        // ============================================================================

        // stack is the subclass of Vector so it has all the properties of a Vector
        // also stack is dynamic array so it has all the properties of an arraylist
        // hence stack can add or remove elements in between

        Stack<Integer> stack2 = new Stack<>();

        stack2.add(1);
        stack2.add(0, 2);
        System.out.println(stack2.get(0));

        // ========================================================================

        // LinkedList as Stack
        LinkedList<Integer> list1 = new LinkedList<>();

        list1.addLast(1); //push
        list1.addLast(2);
        list1.addLast(3);

        list1.getLast(); //peek

        list1.removeLast(); //pop

        // =======================================================================

        // ArrayList as Stack
        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(1); //Push
        list2.add(2);
        list2.add(3);

        System.out.println(list2.get(list2.size()-1)); //peek

        System.out.println(list2.remove(list2.size()-1)); //pop
    

    }
}
