package Collections.Lists.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {

        // creating arraylist =====================================================

      	ArrayList<Integer> list = new ArrayList<Integer>(); //default constructor method

        List<Integer> listWithCapacity = new ArrayList<Integer>(20); //specified initial capacity

        List<String> list2 = Arrays.asList("Monday","Tuesday","Wednesday"); //no adding/delete , only set
                                // OR
        ArrayList<String> list3 = new ArrayList<> (Arrays.asList("Monday","Tuesday","Wednesday")); 

        List<Integer> list4 = List.of(1,2,3); //no modification not even set operation

        Integer [] fruits = {4,5,6};
        List<Integer> list5= new ArrayList<>(Arrays.asList(fruits));

        
        // =========================================================================


        // adding elements to list
        list.add(10);
        list.add(20);
        list.add(30);

        list.add(3,40); 

       
        list5.addAll(list4);
        System.out.println(list5);

        //============================================================================= 
        // printing the list
        System.out.println(list);

        for(int i = 0; i<list.size(); i++){
            System.out.println(i + " index element is "+list.get(i));
        }

        for (Integer i : list) {
            System.out.println("using for each loop "+i);
        }
        // ============================================================================


        // accessing the list elements
        System.out.println(list.get(1));

        // size of the list
        System.out.println(list.size());

        // checking if the element exists 
        System.out.println(list.contains(50));

        // replacing elements
        System.out.println(list.set(3,50));

        System.out.println(list);

        // removing elements
        System.out.println(list.remove(2)); //by index
        System.out.println(list);
        
        System.out.println(list3.remove("Monday")); //by value for strings

        System.out.println(list.remove(Integer.valueOf(50))); //by value for integers
        System.out.println(list);

        // converting to array
        Integer[] newArray = list.toArray(new Integer[0]);

        // sorting a list
        list.add(0);
        System.out.println("unsorted list"+list);
        Collections.sort(list); 
        System.out.println("sorted list"+list);


        
    }
}
