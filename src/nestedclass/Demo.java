package nestedclass;

public class Demo {
    int a=100;
    void m1(){
        System.out.println("instance method m1");
    }static int b=200;
    static void  m2(){
        System.out.println("static member m2");
    }static class A{
        static int number=400;
    }
    Demo(){
        System.out.println("constructor");
    }
    static {
        System.out.println("static block");
    }

    public static void main(String[] args) {
        int b=300;
        Demo demo=new Demo();
        System.out.println("instance variable"+demo.a);
        demo.m1();
        System.out.println("Static variable"+Demo.b);
        Demo.m2();
        System.out.println(Demo.A.number);
        System.out.println("local variable"+b);

    }
}
