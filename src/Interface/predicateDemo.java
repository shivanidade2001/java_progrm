package Interface;

import java.util.function.Predicate;

public class predicateDemo {
    public static void main(String[] args) {


        Predicate predicate1 = new PredicateImpl();
        Predicate predicate = new Predicate() {
            @Override
            public boolean test(Object o) {
                return false;
            }
        };
        System.out.println(predicate1.test("hello"));
        predicate.test("hii");
    }


    }

class PredicateImpl implements Predicate {

    @Override
    public boolean test(Object o) {
        return false;
    }
}
