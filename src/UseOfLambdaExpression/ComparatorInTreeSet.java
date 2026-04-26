package UseOfLambdaExpression;

import com.sun.source.tree.Tree;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorInTreeSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(12);
        set.add(10);
        set.add(34);
        set.add(25);
        System.out.println("Before manual sorting: "+set);

        Set<Integer> treeSet = new TreeSet<>((a,b) -> b-a);
        // Don't need to create separate sorting class (implement Comparator class and implement compare method)
        treeSet.add(12);
        treeSet.add(10);
        treeSet.add(34);
        treeSet.add(25);
        System.out.println("After manual sorting: "+treeSet);
    }
}
