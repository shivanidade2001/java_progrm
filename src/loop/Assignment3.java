package loop;
import java.util.Scanner;
public class Assignment3 {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of rows want to print");
        int i,j,space=1;
        int row=s.nextInt();
        space = row-1;
        for ( j=1;j<=row;j++){
            for (i=1;i<=space;i++){
                System.out.print("");
            }
            space--;
            for (i=1;i<=2*j-1;i++){
                System.out.print("*");
            }
            System.out.println( " ");
        }
        space=1;
        for (j=1;j<=row-1;j++){
            for (i=1;i<=space;i++){
                System.out.println(" ");
            }
            space++;
            for (i=1;i<=2*(row-j)-1;i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
