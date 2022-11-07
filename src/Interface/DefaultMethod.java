package Interface;

public interface DefaultMethod {
     void m1();

    default void m2(){
        System.out.println("default method");
    }
    interface DefaultMethod2{
        void m1();
        default void m2(){
            System.out.println("default method2");
        }
    }

    public static void main(String[] args) {
      DefaultMethod defaultMethod=new B();
      defaultMethod.m1();
      defaultMethod.m2();
      B b=new B();
      b.m1();
      b.m2();
      DefaultMethod defaultMethod1=new DefaultMethod() {
          @Override
          public void m1() {
        System.out.println("anonymous method default method");
          }
      };
      defaultMethod1.m1();

    }
} class B implements DefaultMethod, DefaultMethod.DefaultMethod2 {
    @Override
    public void m1() {
        System.out.println("implement m1");
    }

    @Override
    public void m2() {
        DefaultMethod.super.m2();
        DefaultMethod2.super.m2();
    }
}
