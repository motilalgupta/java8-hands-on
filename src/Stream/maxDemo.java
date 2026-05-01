package Stream;

import java.util.stream.Stream;

public class maxDemo {
    public static void main(String[] args) {
        Integer i = Stream.iterate(0, x -> x + 1)
                .limit(101)
                .map(x -> x / 20)
                .distinct()
                .peek(System.out::println)
                .max((a,b) -> a-b)
                .get();
        System.out.println(i);
    }
}
