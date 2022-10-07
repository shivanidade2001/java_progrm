package loop;
import java.util.Scanner;
public class Assignment24 {
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        System.out.println("enter two number");
        int n1=s.nextInt();
        int n2=s.nextInt();
        int sum=0;
        for(int i=1; i<=n2;i++){
            sum=sum+n1;

        }
        System.out.println("the multiplication is"+n1+"and"+n2+"is"+sum);

    }
}
