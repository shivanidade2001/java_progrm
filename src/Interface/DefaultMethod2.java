package Interface;

public interface DefaultMethod2 {
    void m1();

    default void m2() {
            System.out.println("default method2");
        }

    }

