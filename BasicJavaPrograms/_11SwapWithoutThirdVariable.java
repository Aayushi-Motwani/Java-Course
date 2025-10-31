package BasicJavaPrograms;
import java.util.Scanner;

public class _11SwapWithoutThirdVariable {
    public static void main(String[] args){

        int a,b;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        b = sc.nextInt();

        sc.close();

        System.out.println("before swapping"); 
        System.out.println("first number: " + a + " || Second Number: " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        // (OR this can be used)
        // a = a * b;
        // b = a / b;
        // a = a / b;
    
        System.out.println("after swapping"); 
        System.out.println("first number: " + a + " || Second Number: " + b);

    }
}
