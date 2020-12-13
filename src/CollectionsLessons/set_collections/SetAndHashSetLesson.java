package CollectionsLessons.set_collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SetAndHashSetLesson {
    // Set - коллекция, хранящая уникальные элементы. Методы данной коллекции очень быстры
    // В основе HashSet лежит HashMap. У элементов данного HashMap ключи это элементв HashSet, а значения константа-заглушка
    // когда мы добавляем в HashSet например стрингу "текст" то key = "текст" / value = какая то заглушка

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Zaur");
        set.add("Dima");
        set.add("Vasya");
        set.add("Adam");
        System.out.println(set);

        for (String s : set){
            System.out.println(s);
        }

        set.remove("Zaur");
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("Dima"));

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(5);
        set1.add(2);
        set1.add(3);
        set1.add(1);
        set1.add(8);
        System.out.println(set1);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(7);
        set2.add(4);
        set2.add(5);
        set2.add(3);
        set2.add(8);
        System.out.println(set2);

        HashSet<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println(unionSet); //  будет 7 элементов, потому что дубликаты не помещаются в HashSet

        HashSet<Integer> intersectSet = new HashSet<>(set1);
        intersectSet.retainAll(set2);
        System.out.println(intersectSet); // будет 3 элемента которые одинаковы у двух сетов

        HashSet<Integer> subtractSet = new HashSet<>(set1);
        subtractSet.removeAll(set2);
        System.out.println(subtractSet);// будет два элемента, которые есть в первом сете но нет во втором





    }
}
