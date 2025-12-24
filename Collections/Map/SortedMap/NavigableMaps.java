package Collections.Map.SortedMap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMaps {
    public static void main(String[] args) {
        NavigableMap<Integer, String> map1 = new TreeMap<>();
        map1.put(2, "two");
        map1.put(5, "five");
        map1.put(3, "three");

        System.out.println(map1); //gives sorted result

        System.out.println(map1.lowerKey(4)); //return closest small key  i.e. 3 otherwise null
        System.out.println(map1.ceilingKey(4)); //return closest bigger key  i.e. 5 otherwise null
        System.out.println(map1.higherEntry(1)); //return closest bigger key and value  i.e. 2,"two" otherwise null
        System.out.println(map1.descendingMap()); //returns map in decreasing order
    }
}
