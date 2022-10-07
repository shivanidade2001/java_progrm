package methodprogram;

import java.util.Scanner;

public class Average {

    void Calculate(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter three number");
        int a= s.nextInt();
        int b= s.nextInt();
        int c= s.nextInt();
        float average=(float) (a+b+c)/3;
        System.out.println("average of three number:"+average);
    }

    public static void main(String[]args)
    {
        Average a=new Average();
        a.Calculate();
    }
}
