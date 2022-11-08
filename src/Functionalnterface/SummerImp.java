package Functionalnterface;

public class SummerImp implements Summer{

    public static void main(String[] args) {
        Summer<Integer> lam=(n1, n2)->n1+n2;
                System.out.println("add two integer"+lam.add(65,78));
        Summer<Double> lam1=( n1,  n2)-> n1 + n2;
                System.out.println("add two double"+lam1.add(6.9d,4.6d));
        Summer<Long> lam3=(n1, n2)->n1+n2;
                System.out.println("add two long"+lam3.add(647l,859l));
    }

    @Override
    public Object add(Object n1, Object n2) {
        return null;
    }
}
