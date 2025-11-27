package Collections.Lists.Vector;

import java.util.ArrayList;
import java.util.Vector;

public class ALVsVector {
    public static void main(String[] args) {

        // ===================================================================================
        // ArrayList is not synchronized so it will not give size as 2000

        ArrayList<Integer> list1 = new ArrayList<>();
        Thread t1 = new Thread(() -> {
            for(int i = 0; i<1000; i++){
                list1.add(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i<1000; i++){
                list1.add(i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("size of the ArrayList list1 is "+ list1.size());

        // =================================================================================
        // Vector is synchronized so it will give result as 2000

        Vector<Integer> list2 = new Vector<>();
        Thread t3 = new Thread(() -> {
            for(int i = 0; i<1000; i++){
                list2.add(i);
            }
        });

        Thread t4 = new Thread(() -> {
            for(int i = 0; i<1000; i++){
                list2.add(i);
            }
        });

        t3.start();
        t4.start();
        try {
            t3.join();
            t4.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("size of the Vector is "+list2.size());
    }
}
