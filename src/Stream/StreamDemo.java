package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                sum += arr[i];
            }
        }
        int numbers[] = {10,20,30,40,50,60,70};
        int sum1 = Arrays.stream(numbers).filter(x -> x % 2 == 0).reduce(0,(a,b) -> a+b);


        List<String> list = Arrays.asList("Mohit","Rahul","Sumit");
        Stream<String> myStream = list.stream();

        String[] array = {"Ronak","Sushant","Abhishek",};
        Stream<String> stream = Arrays.stream(array);

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);

        Stream<Integer> iterate = Stream.iterate(0, x -> x + 1);

        Stream<Double> generate = Stream.generate(() -> Math.random()*100).limit(5);


    }
}
