package Stream_Lessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorted {
    public static void main(String[] args) {
        int[] array = {3, 8, 51, 5, 9, 12, 4, 21, 81, 7, 18};
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));

        Man m1 = new Man("Ivan", 'm', 22, 3, 8.3);
        Man m2 = new Man("Nikolay", 'm', 28, 1, 6.4);
        Man m3 = new Man("Elena", 'f', 19, 1, 8.9);
        Man m4 = new Man("Petr", 'm', 25, 4, 7);
        Man m5 = new Man("Mariya", 'f', 23, 3, 7.4);

        List<Man> list = new ArrayList<>();
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);
        list.add(m5);

        list = list.stream().sorted((x,y)->x.getName().compareTo(y.getName())).collect(Collectors.toList());
        System.out.println(list);

    }
}
