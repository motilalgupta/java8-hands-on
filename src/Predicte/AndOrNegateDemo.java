package Predicte;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AndOrNegateDemo {
    public static void main(String[] args) {
        Predicate<String> startsWithLetterM = name -> name.toLowerCase().charAt(0) == 'm';
        Predicate<String> endsWithLetterL = name -> name.toLowerCase().charAt(name.length()-1) == 'l';
        Predicate<String> result = startsWithLetterM.and(endsWithLetterL);
        List<String> stdList = Arrays.asList("rahul","mohit","kartik","motilal");
        for(String list : stdList){
            if (result.test(list)){
                System.out.println(list);
            }
        }
        Predicate<String> startsWithLetterS = name -> name.toLowerCase().charAt(0) == 's';
        Predicate<String> endsWithLetterY = name -> name.toLowerCase().charAt(name.length()-1) == 'y';
        Predicate<String> result2 = startsWithLetterS.or(endsWithLetterY);
        List<String> stdList2 = Arrays.asList("rahul","rohan","kartik","sunaina");
        for(String list2 : stdList2){
            if (result2.test(list2)){
                System.out.println(list2);
            }
        }
        Predicate<String> startsWithLetterR = name -> name.toLowerCase().charAt(0) == 'r';
        Predicate<String> entry = startsWithLetterR.negate();
        List<String> list = Arrays.asList("rahul","mohit","vinit","ronny","mayank","rohn");
        for(String data: list){
            if(entry.test(data)){
                System.out.println(data);
            }
        }
    }
}
