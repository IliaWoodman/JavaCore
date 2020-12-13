package Stream_Lessons;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCollect {
    public static void main(String[] args) {
        Man m1 = new Man("Ivan", 'm', 22, 3, 8.3);
        Man m2 = new Man("Nikolay", 'm', 28, 1, 6.4);
        Man m3 = new Man("Elena", 'f', 19, 2, 8.9);
        Man m4 = new Man("Petr", 'm', 25, 4, 7);
        Man m5 = new Man("Mariya", 'f', 23, 3, 7.4);

        List<Man> list = new ArrayList<>();
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);
        list.add(m5);

//        Map<Integer, List<Man>> map = list.stream()
//            .map(el -> {
//                el.setName(el.getName().toUpperCase());
//                return el;
//            })
//            .collect(Collectors.groupingBy(el -> el.getCourse()));
//
//        for (Map.Entry<Integer, List<Man>> entry : map.entrySet()){
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
        //Вывод такой
        /*  1: [Man{name='NIKOLAY', sex=m, age=28, course=1, avgGrade=6.4}]
            2: [Man{name='ELENA', sex=f, age=19, course=2, avgGrade=8.9}]
            3: [Man{name='IVAN', sex=m, age=22, course=3, avgGrade=8.3}, Man{name='MARIYA', sex=f, age=23, course=3, avgGrade=7.4}]
            4: [Man{name='PETR', sex=m, age=25, course=4, avgGrade=7.0}]
        */


        Map<Boolean, List<Man>> map = list.stream().collect(Collectors.partitioningBy(el -> el.getAvgGrade() > 7));
        for (Map.Entry<Boolean, List<Man>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        /*Вывот такой
        false: [Man{name='Nikolay', sex=m, age=28, course=1, avgGrade=6.4}, Man{name='Petr', sex=m, age=25, course=4, avgGrade=7.0}]
        true: [Man{name='Ivan', sex=m, age=22, course=3, avgGrade=8.3}, Man{name='Elena', sex=f, age=19, course=2, avgGrade=8.9}, Man{name='Mariya', sex=f, age=23, course=3, avgGrade=7.4}]
        */



    }
}
