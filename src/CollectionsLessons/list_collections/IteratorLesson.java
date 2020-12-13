package CollectionsLessons.list_collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorLesson {
    private int a;
    public int b;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("privet");
        arrayList.add("salut");
        arrayList.add("shalom");
        arrayList.add("hello");
//        System.out.println(arrayList);
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
//            System.out.println(iterator.next());
            iterator.next();
            iterator.remove();
        }
        System.out.println(arrayList);
    }
}
