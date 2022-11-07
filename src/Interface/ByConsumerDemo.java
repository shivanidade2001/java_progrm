package Interface;

import java.util.function.BiConsumer;

public class ByConsumerDemo {
    public static void main(String[] args) {
        BiConsumer biConsumer=new ByConsumerImpl();

        BiConsumer biConsumer1=new BiConsumer() {
            @Override
            public void accept(Object o, Object o2) {
            }
        };
        biConsumer.accept("o1","o2"  );
        biConsumer1.accept("o","o2");
          BiConsumer lambda=(Object o, Object o2)->
          {
              System.out.println(("lambda expression"));
          };
          lambda.accept("t","b");
    }

}
class ByConsumerImpl implements BiConsumer{

    @Override
    public void accept(Object o, Object o2) {
        System.out.println("Traditional way");
    }
}
