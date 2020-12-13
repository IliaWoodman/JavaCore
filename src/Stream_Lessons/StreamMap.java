package Stream_Lessons;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args) {

        // метод map() преобразует каждый объект стрима согласно переданному лямбда выражению
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela");
        list.add("OK");
        list.add("poka");

        List<Integer> list2 = list.stream().map(element -> element.length()).collect(Collectors.toList());
//        list = list.stream().map(element->String.valueOf(element.length())).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(list2);


        int[] array = {5, 9, 3, 8, 1};
        System.out.println(Arrays.toString(array));
        array = Arrays.stream(array).map(element -> {
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;
        }).toArray();
        System.out.println(Arrays.toString(array));


        Set<String> set = new HashSet<>();
        set.add("privet");
        set.add("kak dela");
        set.add("OK");
        set.add("poka");
        System.out.println(set);

        Set<Integer> set2 = set.stream().map(e -> e.length()).collect(Collectors.toSet());
        List<Integer> list3  = set.stream().map(e -> e.length()).collect(Collectors.toList());

    }
}
