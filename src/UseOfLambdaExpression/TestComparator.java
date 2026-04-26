package UseOfLambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(70);
        list.add(50);
        list.add(10);
//        Collections.sort(list, new Comparator());     // without lambda expression
        Collections.sort(list, (o1,o2) -> o2-o1); // with lambda expression no need of class comparator
        System.out.println(list);                           // Don't need to create implementation class
    }
}
