package loop;
import java.util.Scanner;
public class Assignment15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number");
        int n = s.nextInt();
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                if (isPrime(i)) {
                    System.out.println("prime factor" + i);
                }
            }
        }
    }

    private static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int i=2;i<n/2;i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
