package Stream_Lessons;

import java.util.stream.Stream;

public class StreamPeak {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        System.out.println(stream1.distinct().peek(System.out::println).count());
    }
}
