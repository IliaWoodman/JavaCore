package CollectionsLessons;

import java.util.Vector;

public class VectorLesson {
    // vector устаревший synchronized класс, в основе содержит массив, не рекомендован для использования
    //методы работают гораздо медленее листов
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("misha");
        vector.add("sasha");
        vector.add("zaur");
        vector.add("ivan");

        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        vector.remove(2);
        System.out.println(vector);
        System.out.println(vector.get(1));

    }
}
