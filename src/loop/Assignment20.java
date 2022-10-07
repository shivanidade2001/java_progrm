package loop;
import java.util.Scanner;
public class Assignment20 {
    public static void main(String[]args){
        System.out.println("enter the positive integer");
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=10;i++){
            int table=n*i;
            System.out.println(table);
        }
    }
}
