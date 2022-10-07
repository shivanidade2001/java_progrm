package loop;

import java.util.Scanner;
import java.util.Scanner;
public class Assignment8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter two number");
        int number1 = s.nextInt();
        int number2 = s.nextInt();
        int gcd = 0;
       for (int i = 2; i <= number1/2 || i<=number2/2; ++i) {
            if (number1%i==0 && number2%i==0 ) {
                gcd = i;
            }
            System.out.println("gcd of"+gcd);
            break;
            }
        }
    }

