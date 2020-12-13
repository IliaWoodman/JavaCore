package Stream_Lessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamMethodChaining {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 9, 12, 21, 81, 7, 18};
        int result = Arrays.stream(array).filter(e -> e % 2 == 1).
            map(e -> {
            if (e % 3 == 0) {
                e = e / 3;
            } return e;}).reduce((a,e)->a+e).getAsInt();
        System.out.println(result);//51
        // проходят 3 1 5 9 21 81 5
        // потом делим только те цифры которые деляться на 3 без остатка 1 1 5 3 7 27 7 == 51


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

        list.stream()
            .map(el -> {el.setName(el.getName().toUpperCase()); return el;})
            .filter(el->el.getSex() == 'f')
            .sorted((x,y)-> x.getAge() - y.getAge()).forEach(el-> System.out.println(el));


        // Пока не будет вызван терминальный метот ни один промежуточный метод работать не будет
        }
    }
