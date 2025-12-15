package Collections.Map;

import java.util.ArrayList;
import java.lang.Comparable;

public class Comparables {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Aayushi", 5.5));
        list.add(new Student("aman", 8.3));
        list.add(new Student("dolly", 4.2));
        list.add(new Student("megha", 6.6));

        list.sort(null); //for natural ordering 
        System.out.println(list); //but this gives error "comparator is required" because no comparator was passed so it doesn't know which order.

        // so in this case we use Comparable class implemented by student class. we also implement all that class methods.

        // ========================================================

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(30);
        list2.add(1);
        list2.sort(null);
        System.out.println(list2); //this will not give error

    }
}

class Student implements Comparable<Student> {
    String name;
    Double gpa;
    public Student(String name, Double gpa) {
        this.name = name;
        this.gpa = gpa;
    }
    public String getName() {
        return name;
    }
    public Double getGpa() {
        return gpa;
    }
    
  
    @Override
    public int compareTo(Student o) {
        return Double.compare(o.getGpa(), this.getGpa()); //the double type class contains the compare method so we can use it.
        // this will return gpa in deccreasing order as we have written o2 - o1
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", gpa=" + gpa + "]";
    }
    
    
    
}

