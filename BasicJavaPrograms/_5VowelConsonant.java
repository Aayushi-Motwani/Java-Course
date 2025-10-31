package BasicJavaPrograms;

import java.util.Scanner;

public class _5VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character : ");
        char alpha = sc.next().charAt(0);

        if(alpha == 'a'|| alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u' || alpha == 'A'|| alpha == 'E' || alpha == 'I' || alpha == 'O' || alpha == 'U') {
            System.out.println(alpha+" is vowel");
        }

        else{
            System.out.println(alpha+" is consonant");
        }

        sc.close();
    }
}
