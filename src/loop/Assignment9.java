package loop;
import java.util.Scanner;
public class Assignment9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        char wantToContinue=' ';
        int counter=0;
        while (wantToContinue != 'Q') {
            System.out.println("enter the number");
            number = s.nextInt();
            counter++;
            sum = sum + number;
            System.out.println("sum is" + sum);
            System.out.println("avg is"+sum/counter);
            System.out.println("Do you want to stop then enter Q45");
            wantToContinue = s.next().charAt(0);
        }
    }
}