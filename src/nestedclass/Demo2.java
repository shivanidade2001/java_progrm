package nestedclass;

public class Demo2 {
    static class hello{
        int a=10;
        static int b=10;
        void m1(){
            System.out.println("hello");
        }static void m2(){
            System.out.println("hello2");
        }
    }class Inner{
        int b1=20;
        void m3(){
            System.out.println("instance method");
        }
    }
    void m4(){
        class LocalInner{
            int a2=10;
        }
        LocalInner localInner=new LocalInner();
        System.out.println(localInner.a2);
    }

    public static void main(String[] args) {
        Demo2.hello h=new Demo2.hello();
        System.out.println(h.a);
       System.out.println(Demo2.hello.b);
       h.m1();
       Demo2.hello.m2();
        Demo2 d=new Demo2();
       Demo2.Inner inner=d.new Inner();
       System.out.println(inner.b1);
       inner.m3();
       d.m4();

    }
}
