package Lambda_lessons;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateLesson {

    /**
     * К разговору о Predicate**/

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("privet");
        list.add("poka");
        list.add("ok");
        list.add("learn java");
        list.add("a imenno lamdas");
        System.out.println(list);
//        list.removeIf( element -> element.length()<5);
        Predicate<String> p = el -> el.length() < 5;
        list.removeIf(p);
        System.out.println(list);

    }
}
