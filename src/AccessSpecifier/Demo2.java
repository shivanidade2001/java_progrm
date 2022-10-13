package AccessSpecifier;

public class Demo2 {
    private int a=10;
    protected int d=20;
    int c=30;
    public int b=5;

    public static void main(String[] args) {
        Demo2 demo2 =new Demo2();
        System.out.println(demo2.a);
        System.out.println(demo2.d);
        System.out.println(demo2.c);
        System.out.println(demo2.b);
        System.out.println(demo2.a);
    }
}
