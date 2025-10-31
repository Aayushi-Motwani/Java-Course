package BasicJavaPrograms;
import java.util.Scanner;

public class _9CompoundInterest {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        double p, r, t, ci;

        System.out.println("enter principal : ");
        p = sc.nextInt();

        System.out.println("enter rate : ");
        r = sc.nextInt();

        System.out.println("enter time : ");
        t = sc.nextInt();

        sc.close();

        ci = p*Math.pow(1+ r/100, t)-p;

        System.out.println("Compound Interest is : "+ci);


    }
}
