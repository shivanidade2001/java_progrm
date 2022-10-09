package nestedclass;

public class Practice {
    int a=100;
    void m1(){
        System.out.println("instance method of a class A");
    }//static nested class
    static class B{
        static int a=100;
        int b=200;
    }//inner class
    class C{
        int p=1;
        void m1(){
            System.out.println("inner class instance method");
        }
    }public static void main(String[] args) {
        Practice p=new Practice();

        System.out.println(p.a);
        p.m1();
        System.out.println(Practice.B.a);
        Practice.B b=new Practice.B();
        System.out.println(b.b);
        Practice.C c=p.new C();
        System.out.println(c.p);
        c.m1();
    }
}
