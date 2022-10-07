package loop;
import java.util.Scanner;
public class Assignment11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the value in a/b");
        int n = s.nextInt();
        int a=1;
        int b=0;
        if (a > b)
        {
            n=b;
        } else
        {
            n=a;
        }for (n=0;n>=1;n--){
            if((a%n==0) && (b%n==0))
            {
                a=a/n;
                b=b/n;
            }
        }
        System.out.println(a+"/"+b);
    }
}