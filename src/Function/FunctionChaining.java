package Function;

import java.util.function.Function;

public class FunctionChaining {
    public static void main(String[] args) {
        Function<String,String> function1 = x -> x.toUpperCase();
        Function<String,String> function2 = x -> x.substring(0,3);
        Function<String,String> stringStringFunction = function1.andThen(function2);

        System.out.println(stringStringFunction.apply("mohit"));

        System.out.println(function1.andThen(function2).apply("mohit")); // can also do like this
    }
}
