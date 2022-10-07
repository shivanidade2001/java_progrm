package methods;

import java.util.Scanner;


public  class Prime{
public static void main(String[]args){
        printPrime();

        }        public static boolean printPrime() {
            Scanner s = new Scanner(System.in);
            System.out.println("enter a number");
            int n = s.nextInt();
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    if (printPrime()) {
                        System.out.println("prime factor" + i);
                    }
                }
            }return printPrime();
        }


}

