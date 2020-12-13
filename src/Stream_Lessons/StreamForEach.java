package Stream_Lessons;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamForEach {
    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 6, 1};

        Arrays.stream(arr).forEach(el->{el*=2;
            System.out.println(el);});

        Arrays.stream(arr).forEach(el-> System.out.println(el));
        Arrays.stream(arr).forEach(System.out::println);
        Arrays.stream(arr).forEach(Utils::maMeth);

        Stream<String> myStream = Stream.of("asd","ewqw", "sdqwd");

    }
    }

class Utils{
    public static void maMeth(int a){
        a=a+5;
        System.out.println("Element = " + a );
    }
}
