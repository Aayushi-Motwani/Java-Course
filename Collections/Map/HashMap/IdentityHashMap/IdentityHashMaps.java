package Collections.Map.HashMap.IdentityHashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMaps {
    public static void main(String[] args) {

        // =====================================In HashMap Case====================================

        String key1 = new String("Key");
        String key2 = new String("Key");
        // here above both have same "key" so their hash code will also be same.
     
        HashMap<String,Integer> map = new HashMap<>();

        map.put(key1, 1);
        map.put(key2, 2);
        // here the hash code is same so index also same now it will check if key1 is equals to key2 using equals method.
        // if yes then collion will occur and LL will be used but if no then value of the key is updated or replaced.

        System.out.println(key1.equals(key2)); //to check the both value //return true
        System.out.println(map); //output {Key=2}

    //    ======================================In IdentityHashMap Case ==================================

    // in output both keys will be returned because IdentityHashMap creates hashcode by object class i.e using == methods that 
    // checks memory address not content.

    String key3 = new String("Key");
    String key4 = new String("Key");
    // here above both have same "key" so their hash code will be different.
    
    IdentityHashMap<String,Integer> map2 = new IdentityHashMap<>();

    map2.put(key3, 3);
    map2.put(key4,4);

    System.out.println(map2); //output {Key=3,Key=4}

    // =================================================================================

    System.out.println(key1.hashCode());
    System.out.println(key2.hashCode());
    // here above two has same hash codes printed because it uses String class hash code and equals method.

    System.out.println(System.identityHashCode(key3));
    System.out.println(System.identityHashCode(key4));
    // here above two has different hash codes printed because it uses Object class hash code and == method.



    }
}
