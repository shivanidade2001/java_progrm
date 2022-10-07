package Inputbyuser;
import java.util.Scanner;
public class Assignment403 {
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter name" );
        String a=sc.next();
        System.out.println("enter roll number");
        int b= sc.nextInt();
        System.out.println("enter field of interest" );
        sc.next();
        String c = sc.nextLine();
        System.out.println("Hey,my name is "+a+" and my roll number is "+b+". My field of interest are"+c+".");
    }

}
