package Collections.Map.LinkedHashMap;

import java.util.LinkedHashMap;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {
    private int capacity;
    
    public LRUCache(int capacity) {
        super(capacity,0.75f,true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
        return size()>capacity;
    }

    public static void main(String[] args) {
        LRUCache<String,Integer> student = new LRUCache<>(3);
        student.put("Aayushi", 10);
        student.put("aman", 20);
        student.put("dolly", 30);
        // after inserting above three the size is full
        System.out.println(student);

        // now inserting this gadhu will replace the Aayushi because it is the eldest
        student.put("gadhu", 40);
        System.out.println(student);

    }




}

    
