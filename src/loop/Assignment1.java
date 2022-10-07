package loop;
import java.util.Scanner;
public class Assignment1 {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        {
            System.out.println("enter a number");
          int n = s.nextInt();
           int sum = 0;
            for (int i = 1; i <= 10; i++)
                sum = sum +i;
            System.out.println("Sum is" + sum);
        }
    }
}
