package MethodOfObjectClass;

public class EqualsMethod {
    public EqualsMethod(int i, String abc) {
    }

    public static void main(String[] args) {
        int a=45;
        int b=53;
        System.out.println(a==b);
        EqualsMethod equalsMethod=new EqualsMethod(1,"abc");
        EqualsMethod equalsMethod1=new EqualsMethod(2,"abc");
        System.out.println(equalsMethod==equalsMethod1);
        System.out.println(equalsMethod.equals(equalsMethod1));
        System.out.println(equalsMethod==equalsMethod);
        System.out.println(equalsMethod.equals(equalsMethod));
        System.out.println(10==10);
    }
}
