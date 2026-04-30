package UnaryAndBinaryOperator;

import java.util.function.BiFunction;

public class BinaryOperator {
    public static void main(String[] args) {
        BiFunction<String,String,String> biFunction = (str1,str2) -> str1 + str2;
        System.out.println(biFunction.apply("Hello","World!"));

        // BinaryOperator
        java.util.function.BinaryOperator<String> binaryOperator = (str1,str2) -> str1+str2;
        System.out.println(binaryOperator.apply("Hello","World!"));
    }
}
