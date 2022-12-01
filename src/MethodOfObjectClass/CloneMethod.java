package MethodOfObjectClass;

public class CloneMethod implements Cloneable{
    int a;
    int b;
    CloneMethod(int a,int b){
        this.a=a;
        this.b=b;
    }
    void m1(){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneMethod cloneMethod=new CloneMethod(10,20);
        cloneMethod.m1();
        CloneMethod cloneMethod1=cloneMethod;
        cloneMethod1.a=30;
        cloneMethod1.b=40;
        cloneMethod1.m1();
        System.out.println(cloneMethod.hashCode());
        System.out.println(cloneMethod1.hashCode());

        CloneMethod clone= (CloneMethod) cloneMethod.clone();
        clone.a=50;
        clone.b=60;
        clone.m1();

        System.out.println(cloneMethod.hashCode());
        System.out.println(clone.hashCode());

    }
}
