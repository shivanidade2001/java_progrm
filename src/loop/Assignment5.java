package loop;
import java.util.Scanner;
public class Assignment5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number");
        int n = s.nextInt();
        {
            for (int i = 1; i <= 10; i++) {
                int table = n * i;

                System.out.println( table);
            }
        }
    }
}