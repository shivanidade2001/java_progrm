package methods;

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        printPrime();

    }

    public static boolean printPrime() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number");
        int n = s.nextInt();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                if (isPrime()) {
                    System.out.println("prime factor" + i);
                }
            }
        }return isPrime();
    }


        private static boolean isPrime (){
            boolean isPrime = true;
            int n = 0;
            for (int i = 2; i < n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            return isPrime;
        }
    }