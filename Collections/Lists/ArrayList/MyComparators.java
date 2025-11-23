package Collections.Lists.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MyComparators {
    public static void main(String[] args) {
        // ======================================================
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(30);
        list.add(40);
        list.add(20);

        list.sort(new IntComparatorsAsc());
        System.out.println(list);

        list.sort(new IntComparatorsDsc());
        System.out.println(list);
        // ======================================================

        List<String> list2 = (Arrays.asList("Pineapple","Papaya","Apple","kiwi"));

        list2.sort(new StringComparatorsAsc());
        System.out.println(list2);
        
        list2.sort(new StringComparatorsDsc());
        System.out.println(list2);

        // ========================================================

        // using lambda expressions
        List<String> list3 = (Arrays.asList("avocado","dragonfruit","Banana","guava"));
        list3.sort((a,b) -> b.length()-a.length()); //for ascending order a-b; for descending order b-a;
        System.out.println(list3);
      
        // using lambda expressions
        List<Integer> list4 = (Arrays.asList(30,20,60,10));
        list4.sort((a,b) -> a-b); //for ascending order a-b; for descending order b-a;
        System.out.println(list4);

    }
  
}

class IntComparatorsAsc implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1-o2; //for ascending order o1-o2
}
}

class IntComparatorsDsc implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1; //for descending order o2-o1;
    }
}

class StringComparatorsAsc implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length(); //for length of the words in ascending order
    }
}


class StringComparatorsDsc implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.length()-o1.length(); //for length of the words in descending order
    }
}




