package Stream_Lessons;

import java.util.ArrayList;
import java.util.List;

public class StreamParallel {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);
        double sumRes = list.parallelStream().reduce((a, e) -> a + e).get();
        System.out.println(sumRes);
        double divisionRes = list.parallelStream().reduce((a, e) -> a / e).get();
        System.out.println(divisionRes);// должно быть 8 а получилось 0.5

    }
}
