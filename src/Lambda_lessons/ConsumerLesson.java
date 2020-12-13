package Lambda_lessons;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerLesson {
    public static void main(String[] args) {
        List<String> list = List.of("privet", "kak dela?", "normalno", "poka");
        for (String s : list) {
            System.out.println(s);
        }
        // можно и так
        list.forEach(str -> System.out.println(str));
        List<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(2);
        list2.add(8);
        list2.add(1);
        list2.add(7);

        list2.forEach(el -> {
            System.out.println(el);
            el *= 2;
            System.out.println(el);
        });
    }
}
