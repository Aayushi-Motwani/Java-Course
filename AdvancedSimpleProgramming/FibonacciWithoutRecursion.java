package AdvancedSimpleProgramming;

import java.util.Scanner;

public class FibonacciWithoutRecursion {
    public void Fibonacci(int N){
        int n1 = 0;
        int n2 = 1;

        for (int i=0; i<N; i++){
            System.out.print(n1 + " ");
            //swaping:-
            int temp = n1 + n2;
            n1 = n2;
            n2 = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int N = sc.nextInt();

        FibonacciWithoutRecursion obj = new FibonacciWithoutRecursion();

        obj.Fibonacci(N);

        sc.close();
    }
}
