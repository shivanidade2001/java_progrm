package nestedclass;

import java.util.concurrent.Callable;

public class Outer {
        int a=100;
        static int b=200;
        static class S{
            int c=300;
            static int d=400;
        }
        class Inner{
        int e=500;
        }
        void m1(){
            class LocalInner{
                int localvar=1000;
            }
            int f=50;
    }public static void main(String[] args) {
      Outer s=new Outer();
      System.out.println(s.a);
      System.out.println(s.b);
      Outer.S s1= new Outer.S();
        System.out.println(s1.c);
        System.out.println(Outer.S.d);

        Outer o =new Outer();
        o.m1();
        System.out.println();

    }
}
