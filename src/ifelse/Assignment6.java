package ifelse;
import java.util.Scanner;
public class Assignment6 {
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        System.out.println("enter the of three persons");
        int p1Age = s.nextInt();
        int p2Age = s.nextInt();
        int p3Age = s.nextInt();
        int oldest = 0;
        int youngest = 0;
        //oldest
        if(p1Age>p2Age && p1Age>p3Age){
            oldest=p1Age;
        } else if (p2Age>p1Age && p2Age>p3Age) {
            oldest = p2Age;
        }else {
            oldest=p3Age;
        }
        //youngest
        if (p1Age<p2Age && p1Age<p3Age){
            youngest = p1Age;
        } else if (p2Age<p1Age && p2Age<p3Age){
            youngest=p2Age;
        }else {
            youngest=p3Age;
        }
            System.out.println("oldest"+oldest);
            System.out.println("youngest"+youngest);
    }
}
