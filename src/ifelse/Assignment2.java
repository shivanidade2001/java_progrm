package ifelse;
import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the value:");
        int a = s.nextInt();
        System.out.println("enter the value:");
        int b = s.nextInt();
        if (a > b)
            System.out.println(a + "is greatest value");
        else {
              System.out.println(b+"is not greatest value");
        }
    }
}