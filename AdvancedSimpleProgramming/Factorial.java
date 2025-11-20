package AdvancedSimpleProgramming;

import java.util.Scanner;

public class Factorial {

    public static int Myfactorial(int fact){
        if (fact == 0){
            return 1;
        }

        return fact * Myfactorial(fact - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int fact = sc.nextInt();

        sc.close();

        System.out.println(Myfactorial(fact));
        


    }
}
