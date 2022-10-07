package methods;

public class PerfectNumber {
    public static void main(String[] args) {
        PrintPerfect();

    }public static void PrintPerfect(){
            int i;
            int num, sum = 0;
            for (num = 1; num < 1000/2; num++) {
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
