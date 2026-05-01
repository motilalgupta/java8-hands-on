package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamMore {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,4322,9,0,5,44,23,433,0,1,2);
        List<Integer> collect = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x / 2)
                .distinct()
                .sorted((a,b) -> b-a)
                .limit(4)
                .skip(1)
                .collect(Collectors.toList());
        System.out.println(collect);

        List<Integer> list1 = Stream
                .iterate(0, x -> x + 1)
                .limit(101).skip(1)
                .filter(x -> x % 2 == 0)
                .map(x -> x / 10)
                .distinct()
                .sorted()
                .peek(x -> System.out.println(x))
                .collect(Collectors.toList());

    }
}
