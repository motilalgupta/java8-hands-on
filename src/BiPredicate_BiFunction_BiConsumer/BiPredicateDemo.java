package BiPredicate_BiFunction_BiConsumer;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x % 2 == 0;
        System.out.println(predicate.test(2));

                        // BiPredicate

        BiPredicate<String,String>  predicate1 = (x,y) -> x.length() == y.length();
        System.out.println(predicate1.test("Rohit","Rahul"));   // true

        BiPredicate<Integer,Integer> predicate2 = (x,y) -> x % 2 == 0 && y % 2 == 0;
        System.out.println(predicate2.test(3,7));       // false

        BiPredicate<String,Integer> predicate3 = (str,x) -> str.length() == x;
        System.out.println(predicate3.test("Rahul",5));     // true
    }
}
