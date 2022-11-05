package Interface;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
    public static void main(String[] args) {
        BinaryOperator binaryOperator=new BinaryOperatorImp();
        BinaryOperator binaryOperator1=new BinaryOperator() {
            @Override
            public Object apply(Object o, Object o2) {
                return null;
            }
        };
        System.out.println(binaryOperator.apply("t1","u2"));
       System.out.println( binaryOperator1.apply("t","u"));

    }
}
class BinaryOperatorImp implements BinaryOperator{

    @Override
    public Object apply(Object o, Object o2) {
        return null;
    }
}
