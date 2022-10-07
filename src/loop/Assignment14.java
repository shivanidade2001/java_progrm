package loop;

public class Assignment14 {
    public static void main(String[] args) {
        int n;
        for (int i = 1; i <= 100; i++)
        {
            if (isPrime(i)) {
                        System.out.println( i);
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
