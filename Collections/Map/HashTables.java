package Collections.Map;

import java.util.Hashtable;

public class HashTables {
    public static void main(String[] args) {
        Hashtable<Integer,String> map1 = new Hashtable<>();

        map1.put(3, "three");
        map1.put(6, "six");
        map1.put(10, "ten");

        // same methods as hashmap
        System.out.println(map1);
        System.out.println(map1.get(6));
        System.out.println(map1.containsKey(3));
        System.out.println(map1.contains("seven"));
        System.out.println(map1.remove(10));
        
        map1.put(null, "value"); //throws exception
        map1.put(1, null); //throws exception



    }
}
