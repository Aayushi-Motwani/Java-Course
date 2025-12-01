package Collections.Map.HashMap;

import java.util.HashMap;

public class Example {
    public static void main(String[] args) {
        
        HashMap<String,Integer> fruit = new HashMap<>();
        fruit.put("apple", 50);
        // now the hash code value is generated using the hash func so ,
        // suppose the hash code for apple is 10832233. 
        // now the index is found, index = 10832233 % array size (default 16), index = 9.
        // apple will be stored in bucket 9. 

        fruit.put("banana", 30);
        // index = 13942244 % 16 = 4

        fruit.put("orange", 80);
        // index = 19332414 % 16 = 14

        fruit.put("grape", 20);
        // index = 548734 % 16 = 14


        // now collision has occured at bucket 14. 
        // now ("orange", 80) and ("grape", 20) both will be stored at 14 in linked list not in a tree. 
        // when threshold size increases (8) then it is stored in red black tree.


    }
}
