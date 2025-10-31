package BasicJavaPrograms;
import java.util.Scanner;

public class _6AreaPerimeterCircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter thr radius: ");
        int radius = sc.nextInt();
        System.out.println("Perimeter of Circle is: " + 2*3.14*radius);
        System.out.println("Area of Circle is: " + 3.14*radius*radius);

        sc.close();

    }
    
}
