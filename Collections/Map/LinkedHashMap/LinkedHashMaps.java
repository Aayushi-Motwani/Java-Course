package Collections.Map.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMaps {
    public static void main(String[] args) {

        LinkedHashMap<String,Integer> map1 = new LinkedHashMap<>(10,0.6f,true);

        // default access order is false
        // access order true prints the element first which is least accessed 

        map1.put("Orange", 40);
        map1.put("Banana", 50);
        map1.put("kiwi", 90);

        map1.get("Banana"); //now banana will be last element to be printed
        map1.get("Orange"); //now orange will be last element to be printed


        for(Map.Entry<String,Integer> entries : map1.entrySet()){
            System.out.println(entries.getKey()+" "+entries.getValue());
        }

        // =============================================================================

        // creating LinkedHashMap using HashMap

        HashMap<String,Integer> map2 = new HashMap<>();
        LinkedHashMap map3 = new LinkedHashMap(map2);

    }
}
