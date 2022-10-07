package Operators;

public class Assignment310 {
    public static void main(String []args) {
        int a = 6;
        int b = 8;
        int c = 0;
        c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);

        int a1=6;
        int b1=8;
        b1=b1-a1;
        a1=b1+a1;
        b1=-(b1-a1);
        System.out.println(a1);
        System.out.println(b1);


    }
}
