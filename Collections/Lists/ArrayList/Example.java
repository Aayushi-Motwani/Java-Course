package Collections.Lists.ArrayList;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;


public class Example{
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Aayushi", 6.7));
        students.add(new Student("Bonny", 8.3));
        students.add(new Student("Charlie", 5.9));

        //in ascending order a.getGpa() - b.getGpa()
        students.sort((a,b) -> {
            if (a.getGpa() - b.getGpa() > 0){
                return 1;
            }
            else if (a.getGpa() - b.getGpa() < 0){
                return -1;
            }
            else {
                return a.getName().compareTo(b.getName()); //to compare strings or length of name in asc order. 
            }
        }); 
        for(Student s : students){
            System.out.println(s.getName()+" "+s.getGpa());
        }

        // =====================================================================

        // using comparator 
        Comparator<Student> comparator = Comparator.comparing(Student::getGpa); // increasing order
        students.sort(comparator);
        for(Student s : students){
            System.out.println(s.getName()+" "+ s.getGpa());
        }

        // using comparator 
        Comparator<Student> comparator1 = Comparator.comparing(Student::getGpa).reversed(); // deccreasing order
        students.sort(comparator1);
        for(Student s : students){
            System.out.println(s.getName()+" "+ s.getGpa());
        }
    }
}

class Student {

    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    } 
}
