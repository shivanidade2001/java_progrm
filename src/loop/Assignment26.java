package loop;

public class Assignment26 {
    public static void main(String[] args) {
        int i;
        int num, sum = 0;
        for (num = 1; num < 1000; num++) {
            for (int j = 1; j <= num-1; j++) {
                if (num % j == 0) {
                    sum = sum + j;
                }
            }
            if (sum == num) {
                System.out.println(sum);
            }
            sum=0;
        }

    }
}
