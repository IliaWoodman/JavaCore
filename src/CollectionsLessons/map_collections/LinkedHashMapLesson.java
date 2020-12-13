package CollectionsLessons.map_collections;

import CollectionsLessons.map_collections.Human;

import java.util.LinkedHashMap;

public class LinkedHashMapLesson {
    //LinkedHashMap является наследником HashMap. Хранит информацию о порядке добавления элементов
    // или порядке их использования. Производительность методов немного ниже, чем у методов HashMap
    // accessOrder == true будет сортировать элементы в мапе по использованию, какой элемент последним использовали такой и будет в самом конце
    public static void main(String[] args) {
        LinkedHashMap<Double, Human> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        Human h1 = new Human("ivan", "petrov", 21);
        Human h2 = new Human("dima", "ivanov", 45);
        Human h3 = new Human("serega", "sidorov", 32);
        Human h4 = new Human("petya", "petuhov", 19);
        Human h5 = new Human("sasha", "putin", 78);

        linkedHashMap.put(5.8, h1);
        linkedHashMap.put(6.4, h2);
        linkedHashMap.put(2.5, h3);
        linkedHashMap.put(7.3, h4);
        linkedHashMap.put(5.2, h5);

        System.out.println(linkedHashMap);
        System.out.println(linkedHashMap.get(5.8));
        System.out.println(linkedHashMap.get(2.5));
        System.out.println(linkedHashMap);
    }
}
