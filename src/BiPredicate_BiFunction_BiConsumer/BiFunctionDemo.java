package BiPredicate_BiFunction_BiConsumer;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDemo {
    public static void main(String[] args) {
        Function<String,Integer> function = x -> x.length();
        System.out.println(function.apply("Mohit"));

            // BiFunction

        BiFunction<String,String,Integer> function1 = (x,y) -> x.length() + y.length();
        System.out.println(function1.apply("Motilal","Megha"));

    }
}
