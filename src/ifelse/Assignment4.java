package ifelse;
import java.util.Scanner;
public class Assignment4 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter your salary");
        int salary = s.nextInt();
        System.out.println("enter your of duration");
        int serviceDuration = s.nextInt();
        float bonusAmount=0.0f;
        if(serviceDuration>5)
            bonusAmount = salary*0.5f;
            System.out.println("your bonus amount"+bonusAmount);
    }
}
