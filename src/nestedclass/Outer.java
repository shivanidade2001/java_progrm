package nestedclass;

public class Outer {
        int a=100;
        static int b=200;
    class Inner{
        int c=50;
    }

    public static void main(String[] args) {
      Outer s=new Outer();
      System.out.println(s.a);
      System.out.println(s.b);

        System.out.println();
    }
}
