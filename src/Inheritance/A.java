package Inheritance;

public class A {
    int c=29;
   static int b=30;
     void m2(){
        System.out.println("m1");
    }
}class B extends A{
    int a=23;
    static int b=34;
     void m1(){
        System.out.println("m2");
    }
    public static void main(String[] args) {
       A a1=new B();
        System.out.println(a1.c);
        System.out.println(A.b);
        System.out.println();


        B b=new B();
        System.out.println(b.b);
        System.out.println(b.c);
        b.m2();
        b.m1();
   }
}
