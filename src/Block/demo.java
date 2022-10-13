package Block;

public class demo {
    int a=10;
    int b;
    static int c=20;
    static int d;
    {
        int b=15;
        System.out.println(b);
    }static {
         int d=20;
         System.out.println(d);
    }

    public static void main(String[] args) {
        demo d=new demo();
        System.out.println(d.a);
        System.out.println(demo.c);

    }
}
