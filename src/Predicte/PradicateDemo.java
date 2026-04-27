package Predicte;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PradicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> pradicate = x -> x > 1000;   // After Predicate
        System.out.println(pradicate.test(100000));

        int salary = 90;
        if (pradicate.test(salary)) {

        }

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);
        int sum = numbers.stream().filter( n -> n % 2 == 0).mapToInt(n -> n).sum();
        System.out.println(sum);        // After Predicate

        int sum2 = 0;
        for(int number: numbers){
            if(number % 2 == 0){
                sum2 += number;         // Before Predicate
            }
        }
        System.out.println(sum2);

    }
    public static boolean fun(int x){
        return x > 10000;                   // Before Predicate, we used to do like this
    }
}