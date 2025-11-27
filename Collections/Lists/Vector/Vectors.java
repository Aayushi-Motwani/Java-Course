package Collections.Lists.Vector;

import java.util.LinkedList;
import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        
        // Vector() means initial capacity is by default 10 && capacity increment is by default double
        Vector<Integer> list = new Vector<>();
        
        System.out.println(list.capacity()); //output 10

        // ======================================================================================

        // Vector(5) means initial capacity is 5 && capacity increment is by default double
        Vector<Integer> list1 = new Vector<>(5);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1.capacity()); //output 5
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        System.out.println(list1.capacity()); // output 10

        // =======================================================================================

        // Vector(5) means initial capacity is 5 && capacity increment is 3
        Vector<Integer> list2 = new Vector<>(5,3);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println(list2.capacity()); //output 5
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        System.out.println(list2.capacity()); // output 8

        // ========================================================================================

        // Vector containing the elements of the specified Collections
        LinkedList<Integer> Linkedlist1 = new LinkedList<>();
        Linkedlist1.add(1);
        Linkedlist1.add(2);
        Linkedlist1.add(3);
        Vector<Integer> List3 = new Vector<>(Linkedlist1);
        System.out.println(List3.capacity()); //output 3

        // =========================================================================================

        // methods in Vector
        list.add(1);
        list.add(2);
        list.add(0,0);
        list.get(1);
        list.contains(2);
        list.set(2, 5);
        list.size();
        list.isEmpty();
        list.remove(0);
        list.remove(list1); //not working dont know why
        // list.clear();

        for(int i =0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }






        
    }
}
