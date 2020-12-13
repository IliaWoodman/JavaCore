package Stream_Lessons;

import java.util.stream.Stream;

public class StreamCount {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);

//        System.out.println(stream1.count());
        //stream нельзя переиспользовать
        System.out.println(stream1.distinct().count());
    }
}
