import java.util.Scanner;

public class AddingBinaryNumbers {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first Binary number: ");
        String Binary1 = sc.nextLine();

        System.out.print("Enter the second Binary number: ");
        String Binary2 = sc.nextLine();

        int num1 = Integer.parseInt(Binary1, 2);
        int num2 = Integer.parseInt(Binary2, 2);

        int Sum = num1 + num2;

        String result = Integer.toBinaryString(Sum);

        System.out.println("sum of two binary numbers is: "+ result);




    }
}
