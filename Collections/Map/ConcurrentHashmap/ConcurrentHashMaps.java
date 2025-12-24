package Collections.Map.ConcurrentHashmap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMaps {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,String> map1 =  new ConcurrentHashMap<>();

        // java 7 --> segment based locking
        // java 8 --> no segment based locking but uses CAS that is Compare and Swap
        // in CAS there is no locking involved except resizing and collision handling.
        // example of CAS : thread A last value is 10 , thread A wants to update it to 15
        // so it will check if the last value is still 10 , if yes then it will update it to 15.
        // but this can cause looping if multiple threads are trying to update the same value
        // so it will wait for some time and try again.


    }
}
