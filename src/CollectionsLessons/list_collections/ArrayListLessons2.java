package CollectionsLessons.list_collections;


import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListLessons2 {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("privet");
        list1.add("poka");
        list1.add("kak dela");
        System.out.println(list1);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("123");
        list2.add("456");
//addAll
        list2.addAll(1,list1);
        System.out.println(list2);
//list2.clear();
        System.out.println(list2);
//contains
        System.out.println(list2.contains("privet"));
    }
}
