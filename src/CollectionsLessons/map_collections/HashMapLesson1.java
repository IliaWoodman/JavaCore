package CollectionsLessons.map_collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapLesson1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<>();
//put
        map1.put(1232, "Sasha Ivanov");
        map1.put(5342, "Dima Petrov");
        map1.put(2434, "Serega Dibrov");
        map1.put(5765, "Masha Sidorova");
        System.out.println(map1);
//putIfAbsent добавляет если такого ключе еще нет
        map1.putIfAbsent(1232, "Vova Abramkin");
        System.out.println(map1);
        map1.putIfAbsent(9999, "Vova Abramkin");
        System.out.println(map1);
//get выводит значения по ключу
        System.out.println(map1.get(1232));
//remove удаляет по ключу
        map1.remove(5342);
        System.out.println(map1);
//containsValue
        System.out.println(map1.containsValue("Serega Dibrov")); // true false
//containsKey
        System.out.println(map1.containsKey(2434));
//keySet возвращает множество ключей
        System.out.println(map1.keySet());
//values возвращает множество значений
        System.out.println(map1.values());
//entrySet
        for (Map.Entry<Integer, String> entry : map1.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
