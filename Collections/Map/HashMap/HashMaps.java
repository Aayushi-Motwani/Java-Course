package Collections.Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps {
    public static void main(String[] args) {
        
        HashMap<Integer,String> map1 = new HashMap<>();

        HashMap<Integer,String> map2 = new HashMap<>(17); // default initial capacity is 16

        HashMap<Integer,String> map3 = new HashMap<>(17,0.5f); //resizing 

        map1.put(2, "Aayushi");
        map1.put(4, "Aman");
        map1.put(10, "Dolly");

        System.out.println(map1.get(10)); //Dolly
        System.out.println(map1.get(20)); //Null

        System.out.println(map1.containsKey(4)); //true
        System.out.println(map1.containsValue("Motwani")); //false

        // =====================================================================

        // for iterating on HashMap
        for(int i : map1.keySet()){
            System.out.println(map1.get(i));
        }

        // Orr this way
        Set<Map.Entry<Integer,String>> entries = map1.entrySet();
        for(Map.Entry<Integer,String> entry : entries){
            entry.setValue(entry.getValue().toUpperCase());
        }
        System.out.println(map1);

        // =======================================================================

        //removing entries
        System.out.println(map1.remove(10)); //Dolly
        System.out.println(map1.remove(2, "AMAN")); //false


    }
}
