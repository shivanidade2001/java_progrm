package loop;
import java.util.Scanner;
public class Assignment16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        int n = s.nextInt();
        int evenSum = 0,oddSum=0;
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(" even number is " + i);
                evenSum=evenSum+i;
            }
            }
                for(int i=0;i<=n;i++) {
                 if (i % 2 != 0) {
                     System.out.println("odd no is" + i);
                     oddSum = oddSum + i;
                 }
             }
                System.out.println("sum of odd number is"+evenSum);
        System.out.println("sum of even number is"+oddSum);
    }
}
