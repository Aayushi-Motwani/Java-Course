import java.util.Scanner;

public class SwapUsingTemp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a,b;

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        b = sc.nextInt();

        System.out.println("before swapping"); 
        System.out.println("first number: " + a + " || Second Number: " + b);

        int temp = a;
        a = b;
        b = temp;
    
        System.out.println("after swapping"); 
        System.out.println("first number: " + a + " || Second Number: " + b);

    }
}
