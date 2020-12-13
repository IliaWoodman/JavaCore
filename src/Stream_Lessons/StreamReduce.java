package Stream_Lessons;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamReduce {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);
        int result = list.stream().reduce((acumulator, element) -> acumulator * element).get();
        // имеем стрим со значениями 5 8 2 4 3
        // accumulator = 5  40  80  320  960
        // element =     8   2   4    3
        // Optional это что то типо обертки над значение
//        System.out.println(result);
        int result2 = list.stream().reduce(1, (acumulator, element) -> acumulator * element);
        // здесь в качестве первого значение для аккумулятора мы устанавляваем 1 и метод гет уже не нужен
        // так как мы в любом случае получим хотябы единицу
        // имеем стрим со значениями 5 8 2 4 3
        // accumulator = 1  5  40  80  320  960
        // element =     5  8  2   4   3

        List<String> sList = new ArrayList<>();
        sList.add("privet");
        sList.add("poka");
        sList.add("kak dela");
        sList.add("OK");

        String resString = sList.stream().reduce((a,e)->a +" " + e).get();
        System.out.println(resString);
//        List<Integer> list100 = new ArrayList<>();
        // int result100 = list100.stream().reduce((accumulator, element) -> accumulator*element).get();
        //  System.out.println(result100);//Exception in thread "main" java.util.NoSuchElementException: No value present

//        Optional<Integer> o = list100.stream().reduce((acumulator, element) -> acumulator*element);
//        if (o.isPresent()){
//            System.out.println(o.get());
//        }else {
//            System.out.println("Not present");
//        }


    }
}
