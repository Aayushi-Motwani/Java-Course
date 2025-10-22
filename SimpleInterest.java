import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        double p, r, t, si;

        System.out.println("enter principal : ");
        p = sc.nextInt();

        System.out.println("enter rate : ");
        r = sc.nextInt();

        System.out.println("enter time : ");
        t = sc.nextInt();

        sc.close();

        si = (p*r*t)/100;

        System.out.println("Simple Interest is : "+ si);

    }
}
