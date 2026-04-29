package BiPredicate_BiFunction_BiConsumer;

import java.util.function.Consumer;

public class BiConsumer {
    public static void main(String[] args) {
        Consumer<Integer> consumer = x -> System.out.println(x);
        consumer.accept(82);

        // BiConsumer

        java.util.function.BiConsumer<Integer,Integer> consumer1 = (x,y) ->
                System.out.println(x+y);
        consumer1.accept(2,5);
    }
}
