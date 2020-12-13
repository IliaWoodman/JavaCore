package Stream_Lessons;

import java.util.ArrayList;
import java.util.List;

public class StreamMinAndMaxAndLimitAndSkip {
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

        Man min = list.stream().min((x,y)-> x.getAge() - y.getAge()).get();
        System.out.println(min);
        Man max = list.stream().max((x,y)-> x.getAge() - y.getAge()).get();
        System.out.println(max);
        System.out.println("limit");
        list.stream().filter(el-> el.getAge()>20).sorted((x,y)-> x.getAge() - y.getAge()).limit(2).forEach(System.out::println);
        System.out.println("skip");
        list.stream().filter(el-> el.getAge()>20).sorted((x,y)-> x.getAge() - y.getAge()).skip(2).forEach(System.out::println);

    }
}
