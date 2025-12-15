package Collections.Map.SortedMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMaps {
    public static void main(String[] args) {
        SortedMap<String,Integer> map1 = new TreeMap<>();
        map1.put("megha", 23);
        map1.put("Lala", 78);
        map1.put("Aayushi", 42);
        map1.put("zozo", 90);

        System.out.println(map1); //prints the keys sorted naturally (ascending) i.e. {Aayushi=42, Lala=78, megha=23, zozo=90}

        // ============================================================================

        SortedMap<Integer,String> map2 = new TreeMap<>();
        map2.put(23,"megha" );
        map2.put(78,"Lala");
        map2.put(42,"Aayushi");
        map2.put(90,"zozo");

        System.out.println(map2); //prints the keys sorted naturally (ascending) i.e. {23=megha, 42=Aayushi, 78=Lala, 90=zozo}

        // ===============================various methods of SortedMap=============================================

        System.out.println(map1.firstKey()); //return first key i.e. Aayushi
        System.out.println(map1.lastKey()); //return first key i.e. zozo
        System.out.println(map1.headMap("megha")); //return first to toKey (exclude last) i.e. Aayushi=42, Lala=78
        System.out.println(map1.tailMap("Lala")); //return from fromKey to last key i.e. Lala=78, megha=23, zozo=90
        System.out.println(map1.subMap("Aayushi", "megha")); //return both fromKey to toKey(exclude last) i.e. Aayushi=42, Lala=78

        // ================================now this is for decreasing or custom sorting using COMPARATOR=============================

        SortedMap<String,Integer> map3 = new TreeMap<>((a,b) -> b.length() - a.length()); //a.length() and b.length() in case keys are string
        map3.put("gold", 23);
        map3.put("silver", 78);
        map3.put("platinum", 42);
        map3.put("bronze", 90);
        System.out.println(map3); // this gives {platinum=42, silver=90, gold=23} , it skips bronze because 
        // Remaining unique lengths:
        // 8 → platinum
        // 6 → silver (with bronze's value)
        // 4 → gold
        // so to overcome this we use this below

        // SortedMap<String, Integer> map3 = new TreeMap<>(
        //     (a, b) -> {
        //         int lenCompare = Integer.compare(b.length(), a.length());
        //         return (lenCompare != 0) ? lenCompare : a.compareTo(b);
        //     }
        // );

        // or we use it by this below

        // SortedMap<String, Integer> map3 = new TreeMap<>(
        //     Comparator.comparingInt(String::length)
        //             .reversed()
        //             .thenComparing(Comparator.naturalOrder())
        // );


        SortedMap<Integer,String> map4 = new TreeMap<>((a,b) -> b-a); //in case keys are integer
        map4.put(23,"megha" );
        map4.put(78,"Lala");
        map4.put(42,"Aayushi");
        map4.put(90,"zozo");
        System.out.println(map4); // returns {90=zozo, 78=Lala, 42=Aayushi, 23=megha}

        // ==============================now this is for decreasing or custom sorting using COMPARABLE===========================




        
    }
}
