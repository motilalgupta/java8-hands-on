package Stream;

import java.util.stream.Stream;

public class CountDemo {
    public static void main(String[] args) {
        long count = Stream.iterate(0, x -> x + 1).limit(101).map(x -> x / 20).distinct().count();
        System.out.println(count);
    }
}
