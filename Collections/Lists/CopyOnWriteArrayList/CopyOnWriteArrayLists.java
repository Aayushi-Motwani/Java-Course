package Collections.Lists.CopyOnWriteArrayList;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayLists {
    public static void main(String[] args) {

        // ======================================================

        //===============================// this ArrayList gives ConcurrentModificationException Exception //==========================

        // ArrayList<String> list1 = new ArrayList<>();
        // list1.add("Apple");
        // list1.add("Banana");
        // list1.add("orange");

        // for(String item : list1){
        //     System.out.println(item);
        //     if (item == "Banana") {
        //         list1.add("Kiwi");
        //         System.out.println("Added Kiwi while reading  "+list1);
        //     }
            
        // }

        // System.out.println("updated list  "+list1);

        // =====================================================================

        //===============================// this CopyOnWriteArrayList runs successfully //=======================

        CopyOnWriteArrayList<String> list1 = new CopyOnWriteArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("orange");

        for(String item : list1){
            System.out.println(item);
            if (item == "Banana") {
                list1.add("Kiwi");
                System.out.println("Added Kiwi while reading  "+list1);
            }
            
        }

        System.out.println("updated list  "+list1);
    }
}
