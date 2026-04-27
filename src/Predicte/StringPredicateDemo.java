package Predicte;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StringPredicateDemo {
    private static Predicate<String> startsWithLetterM ;

    public static void main(String[] args) {
        Predicate<String> startsWithLetterM  = name -> name.toLowerCase().charAt(0) == 'm';
        List<String> nameList = Arrays.asList("dablu","rahul","motilal");
        for(String name: nameList) {
            if (startsWithLetterM.test(name)) {
                System.out.println(name);
            }
        }
    }
}
