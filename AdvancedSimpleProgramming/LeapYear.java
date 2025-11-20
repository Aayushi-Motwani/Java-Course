package AdvancedSimpleProgramming;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year");

        int year = sc.nextInt();

        if (year % 4 == 00 || year % 400 == 00 && year % 100 != 00){
            System.out.println(year + " is leap year");
        }
        else {
            System.out.println(year + " is not leap year");
        }
        sc.close();
    }
}
