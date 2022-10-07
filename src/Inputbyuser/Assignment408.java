package Inputbyuser;
import java.util.Scanner;
public class Assignment408 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter first number");
        int a = s.nextInt();
        System.out.println("enter second number");
        int b = s.nextInt();
        System.out.println("enter third number");
        int c = s.nextInt();
        System.out.println("all are equal:"+(a==b&&b==c&&c==a));
        System.out.println("any two are equal:"+(a==b||b==c||c==a));


    }
}
