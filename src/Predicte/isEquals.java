package Predicte;

import java.util.Objects;
import java.util.function.Predicate;

public class isEquals {
    public static void main(String[] args) {
        Predicate<String> startsWithM = x -> x.toLowerCase().charAt(0) == 'm';
        Predicate<Object> predicate = Predicate.isEqual("rahul");
        System.out.println(predicate.test("mohit"));        // returns false
        System.out.println(predicate.test("rahul"));        // returns true
    }
}
