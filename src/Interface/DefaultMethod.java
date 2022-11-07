package Interface;

public interface DefaultMethod {
    void m1();
    default void m2() {
        System.out.println("default method");
    }public static void main(String[] args) {
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
}
