package Collections.Lists.CopyOnWriteArrayList;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Example {
    public static void main(String[] args) {

        // ====================this gives ConcurrentModificationException Exception===================================

    //  ArrayList<String> list1 = new ArrayList<>();
    //  list1.add("item1");
    //  list1.add("item2");
    //  list1.add("item3");

    //  Thread ReaderThread = new Thread(() -> {
    //     try {
    //         while (true) {
    //             for(String item: list1){
    //                 System.out.println("reading item " +item);
    //                 Thread.sleep(100);
    //             }
    //         }
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
    //  });

    //  Thread WriterThread = new Thread(() -> {
    //     try {
    //         Thread.sleep(500);
    //         list1.add("item4");
    //         System.out.println("added item4 to the list1");
    //         Thread.sleep(500);
    //         list1.remove("item1");
    //         System.out.println("removed item1 from the list1");
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
    //  });

    // =========================================this runs okay==============================================

    CopyOnWriteArrayList<String> list1 = new CopyOnWriteArrayList<>();
     list1.add("item1");
     list1.add("item2");
     list1.add("item3");

     Thread ReaderThread = new Thread(() -> {
        try {
            while (true) {
                for(String item: list1){
                    System.out.println("reading item " +item);
                    Thread.sleep(100);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
     });

     Thread WriterThread = new Thread(() -> {
        try {
            Thread.sleep(500);
            list1.add("item4");
            System.out.println("added item4 to the list1");
            Thread.sleep(500);
            list1.remove("item1");
            System.out.println("removed item1 from the list1");
        } catch (Exception e) {
            e.printStackTrace();
        }
     });

     ReaderThread.start();
     WriterThread.start();


        
    }
    
}
