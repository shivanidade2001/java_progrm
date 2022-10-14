package Inheritance;

public class Test {
    public static void main(String[] args) {
        A1 ab=new B1();
        System.out.println(ab.a);
        System.out.println(ab.b);
        System.out.println(ab.c);
         ab.m1();
         B1 ba=new C();
        System.out.println(ba.a);
        System.out.println(ba.b);
        System.out.println(ba.c);
        ba.m1();
    }
}
