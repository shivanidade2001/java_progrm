package abstraction;

public class C extends B {
    int a=30;
    int c=30;
    void display(){
        int a=40;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        C c=new C();
        c.display();
        B b=new C();
        System.out.println(b.a);
        System.out.println(b.b);
        b.m1();
    }

    @Override
    void m1() {
     System.out.println("implement method");
    }
}
