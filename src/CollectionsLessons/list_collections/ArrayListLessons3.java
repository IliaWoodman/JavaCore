package CollectionsLessons.list_collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListLessons3 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");

        StringBuilder[] array = {sb1, sb2, sb3, sb4};

        List<StringBuilder> list = Arrays.asList(array);//полученый лист тесно связан с array
        System.out.println(list);
        array[0].append("!!!");
        System.out.println(list);


        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("privet");
        arrayList.add("salut");
        arrayList.add("shalom");
        arrayList.add("hello");
        System.out.println(arrayList);

//removeAll
//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("privet");
//        arrayList2.add("goodbye");
//        arrayList2.add("hello");
//        System.out.println(arrayList2 + " arrayList2");
//        arrayList.removeAll(arrayList2);
//        System.out.println(arrayList+ " after removeAll");

//retainAll в листе1 остануться только элементы которые есть и в лист1 и лист3
//        ArrayList<String> arrayList3 = new ArrayList<>();
//        arrayList3.add("privet");
//        arrayList3.add("goodbye");
//        arrayList3.add("hello");
//        System.out.println(arrayList3 + " arrayList3");
//        arrayList.retainAll(arrayList3);
//        System.out.println(arrayList + " after retainAll");

//containsAll
//        System.out.println(arrayList.containsAll(arrayList3));

//subList возвращает List

//        List<String>subList1 = arrayList.subList(1,2); // второй параметр не включен
//        System.out.println(subList1 + " subList"); // subList является представление основного листа и тесно связан с ним, в листе нельзя проводить изменения, хотя set можно
//        arrayList.set(1,"salam");// и изменения в саб листе отражаются в листе
////        arrayList.add("salam");// здесь вылетит exception
//        subList1.add("pokaaa");
//        System.out.println(subList1 + " subList after add");
//        System.out.println(arrayList);

//        String[] arr = arrayList.toArray(new String[arrayList.size()-1]);//в размере можно писать 0
//        Object[] arr2 = arrayList.toArray();

//List.of работает после java8
// можно заполнять лист без метода эдд
// данный лист не изменяемый
        List<Integer> list1 = List.of(3, 8, 13);
        System.out.println(list1);
//        list1.add(100);  нельзя добавлять

//List.copyOf
// лист тоже неизменяемый и не могут содержать null
        List<String> list2 = List.copyOf(arrayList);
        System.out.println(list2 + " list2");

    }
}
