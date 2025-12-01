package Collections.Map.HashMap;

import java.util.HashMap;
import java.util.Objects;

public class HashCodeAndEqualsMethod {
    public static void main(String[] args) {
        HashMap<Student,Integer> map1 = new HashMap<>();

        Student s1 = new Student("Aayushi", 1);
        Student s2 = new Student("Aman", 2);
        Student s3 = new Student("Aayushi", 1); //same as s1 ;

        map1.put(s1, 340); //hashcode1 --> index1
        map1.put(s2, 600); //hashcode2 --> index2
        map1.put(s3, 250); //hashcode3 --> index3  -----//different than s1 because in objects(Student) memory address is different

        System.out.println(map1.size()); //3
        System.out.println(map1.get(s1)); //340
        System.out.println(map1.get(s3)); //250 even though s1 and s3 are same.

        // so to avoid these same value being treated differently we use hashcode method and Equals method in the Student class.

        // after generating those methods now size will return 2, and s1 and s3 will return 250 .

        // =================================================================================

        HashMap<String,Integer> map2 = new HashMap<>();

        map2.put("Aayushi", 10); //hashcode1 --> index1
        map2.put("Aman", 40); //hashcode2 --> index2
        map2.put("Aayushi", 70); //hashcode1 --> index1 --> Equals() --> replace ---//same as s1 because memory address/ reference in String.



        
    }
}

class Student{
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    
   

    // =========================generating hashcode and Equals method and toString============================================
    
    @Override
    public int hashCode() {
        return Objects.hash(name,id);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (id != other.id)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", id=" + id + "]";
    }
}