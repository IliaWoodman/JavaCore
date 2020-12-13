package Stream_Lessons;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapToInt {
    public static void main(String[] args) {
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

//        List<Integer> intList = list.stream()
//            .mapToInt(el-> el.getCourse())
//            .boxed()//boxed конвертирует из int в Integer // из примитива в класс
//            .collect(Collectors.toList());

        int sum = list.stream().mapToInt(el -> el.getCourse()).sum();
        System.out.println(sum);
        int min= list.stream().mapToInt(el -> el.getCourse()).min().getAsInt();
        System.out.println(min);
        int max= list.stream().mapToInt(el -> el.getCourse()).max().getAsInt();
        System.out.println(max);
        double average = list.stream().mapToInt(el -> el.getCourse()).average().getAsDouble();
        System.out.println(average);
    }
}
