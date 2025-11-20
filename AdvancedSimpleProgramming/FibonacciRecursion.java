package AdvancedSimpleProgramming;

import java.util.Scanner;

public class FibonacciRecursion {
    public static int Fibonacci(int N){
        if (N == 0){
            return 0;
        }
        if (N == 1 || N == 2){
            return 1;
        }

        return Fibonacci(N - 2) + Fibonacci(N - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int N = sc.nextInt();

        sc.close();

        for(int i = 0; i<N; i++){
            System.out.print(Fibonacci(i) + " ");
        }
    }
}
