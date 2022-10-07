package methods;

import java.util.Scanner;

public class SumDigit {
    void Add(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter two number");
        int n1=s.nextInt();
        int n2=s.nextInt();
        int sum =n1+n2;
        System.out.println("sum of two number is"+sum);
    }public static void main(String[]args){
        SumDigit sum=new SumDigit();
        sum.Add();
    }
}
