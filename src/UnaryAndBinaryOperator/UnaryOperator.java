package UnaryAndBinaryOperator;

import java.util.function.Function;

public class UnaryOperator {
    public static void main(String[] args) {
        Function<Integer,Integer> function = x -> x*x;
        System.out.println(function.apply(5));
        Function<String,String> function1 = str -> str.toLowerCase();
        System.out.println(function1.apply("MOHIT"));

        // Unary Operator
        java.util.function.UnaryOperator<Integer> unaryOperator = x -> x*x;
        System.out.println(unaryOperator.apply(5));
        java.util.function.UnaryOperator<String> unaryOperator1 = str -> str.toLowerCase();
        System.out.println(unaryOperator1.apply("MOHIT"));
    }
}
