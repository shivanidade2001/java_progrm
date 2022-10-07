package methods;

import java.util.Scanner;

public class Product {
    int  product(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter two number");
        int n1=s.nextInt();
        int n2=s.nextInt();
         return n1*n2;

    }public static void main(String[]args){
        Product p=new Product();
        System.out.println("product of two number is"+p.product());
    }
}
