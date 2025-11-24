package Collections.Lists.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {

        // =========================================================

        // creating LinkedList 

        LinkedList<Integer> list1 = new LinkedList<>();

        LinkedList<String> list2 = new LinkedList<>(Arrays.asList("Cat","Dog","Elephant"));

        // ======================================================

        // adding the element
        list1.add(1);
        list1.add(5);
        list1.add(10);

        list1.add(2,3);

        list1.addFirst(0);

        list1.addLast(20);

        System.out.println(list1);

        // =======================================================

        // accessing the elements

        System.out.println(list1.get(4));

        System.out.println(list1.getFirst());
        

        System.out.println(list1.getLast());

        // ===========================================================

        // remove elements
        System.out.println(list1.remove(3));
     
        System.out.println(list1.removeFirst());

        System.out.println(list1.removeLast());
        System.out.println(list1);

        LinkedList<String> colors = new LinkedList<>(Arrays.asList("red","blue","pink","yellow"));
        LinkedList<String> colorsToRemove = new LinkedList<>(Arrays.asList("red","blue"));
        colors.removeAll(colorsToRemove);
        System.out.println(colors);

    }
}
