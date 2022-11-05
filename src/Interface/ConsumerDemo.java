package Interface;

import java.util.function.Consumer;

public interface ConsumerDemo {
    public static void main(String[] args) {
         Consumer consumer1=new ConsumerImpl();
        Consumer consumer=new Consumer() {


            @Override
            public void accept(Object o) {
                System.out.println("anonymous way");
            }
        };
        consumer1.accept("hii");
        consumer.accept("fgh");
    }
    public class ConsumerImpl implements Consumer {

        @Override
        public void accept(Object o) {
            System.out.println("traditional way");
        }
    }
}
