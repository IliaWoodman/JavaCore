package CollectionsLessons.map_collections;

import CollectionsLessons.map_collections.Human;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapLessons {
    // В основе TreeMap лужит красно-черное дерево. Это позволяет методам работать быстро, но медленее, чем методы HashMap
    // это двоичное, самобалансирующееся дерево
    public static void main(String[] args) {
        TreeMap<Double, Human> treeMap = new TreeMap<>();
        Human h1 = new Human("ivan", "petrov", 21);
        Human h2 = new Human("dima", "ivanov", 45);
        Human h3 = new Human("serega", "sidorov", 32);
        Human h4 = new Human("petya", "petuhov", 19);
        Human h5 = new Human("sasha", "putin", 78);

        treeMap.put(5.8, h1);
        treeMap.put(6.4, h2);
        treeMap.put(2.5, h3);
        treeMap.put(7.3, h4);
        treeMap.put(5.2, h5);

        System.out.println(treeMap);
//        System.out.println(treeMap.get(6.4));
//        treeMap.remove(2.5);
//        System.out.println(treeMap);

//descendingMap - разворачивает мапу
        System.out.println(treeMap.descendingMap());
//tailMap - возвращает значения "от"
        System.out.println(treeMap.tailMap(6.4)); //{6.4=Human{name='dima', surname='ivanov', age=45}, 7.3=Human{name='petya', surname='petuhov', age=19}}
//tailMap - возвращает значения "до"
        System.out.println(treeMap.headMap(6.4)); //{2.5=Human{name='serega', surname='sidorov', age=32}, 5.2=Human{name='sasha', surname='putin', age=78}, 5.8=Human{name='ivan', surname='petrov', age=21}}
//lastEntry - возвращает последнй элемент
        System.out.println(treeMap.lastEntry());
//firstEntry - возвращает первый элемент
        System.out.println(treeMap.firstEntry());


        TreeMap<Human,Double> treeMap1 = new TreeMap<>();

        treeMap1.put(h1,5.8);
        treeMap1.put(h2,6.4);
        treeMap1.put(h3,2.5);
        treeMap1.put(h4,7.3);
        treeMap1.put(h5,5.2);
        System.out.println(treeMap1); // выдаст exception потому что класс Human не реализует Comparable
// либо при создании TreeMap в параметре передать компаратор
        TreeMap<Human,Double> treeMap2 = new TreeMap<>(new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return 0;
            }
        });

    }
}
