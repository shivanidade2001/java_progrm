package nestedclass;

import java.util.concurrent.Callable;

public class Outer {
    int a=100;
    static int g=700;
    class Inner {
        int e = 500;
    }
        static int b=200;
        static class S{
            int c=300;
            static int d=400;
        }

        void m1() {
            class LocalInner {
                int localvar = 1000;
            }
            LocalInner localInner = new LocalInner();
            System.out.println(localInner.localvar);
            int a = 50;
            System.out.println(a);
        }
    public static void main(String[] args) {
      Outer o=new Outer();
      System.out.println(o.a);
      System.out.println(o.b);
      Outer.S s1= new Outer.S();
        System.out.println(s1.c);
        System.out.println(Outer.S.d);
        Outer.Inner inner=o.new Inner();
        System.out.println(inner.e);
        o.m1();
        System.out.println(Outer.g);


    }
}
