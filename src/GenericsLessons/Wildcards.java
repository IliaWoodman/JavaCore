package GenericsLessons;

//import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {
        //когда в генерике ставят ? это вайлдкард, значит можно будет подставить любой класс
        List<?> list1 = new ArrayList<Integer>();
        // так не прокатит так как компилятор не знает какой класс указан в генерике
        //  list1.add(3.14);
        //  list1.add("Pafds");
        //  list1.add(33333);

        // можем ограничить вайлдкард
        List<? extends Number> list33 = new ArrayList<>();


        List<Double> list2 = new ArrayList<>();
        list2.add(3.14);
        list2.add(3.4);
        list2.add(9.88);
        list2.add(0.999);
        showListInfo(list2);

        List<String> list3 = new ArrayList<>();
        list3.add("Privet");
        list3.add("adf");
        list3.add("sdgafzd");
        list3.add("jwndjlsazlk");
        showListInfo(list3);

        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(3.33);
        doubleList.add(3.3555);
        doubleList.add(3.465);
        System.out.println(sum(doubleList));

        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(324);
        integerList.add(3532);
        integerList.add(3123);
        System.out.println(sum(integerList));

        List<? super Number> List = new ArrayList<Object>();


        //так не прокатит потому что ? extends Number
//        ArrayList<String> stringList = new ArrayList<>();
//        stringList.add("sfdgf");
//        System.out.println(sum(stringList));
    }

    public static void showListInfo(List<?>list){
        System.out.println(list);
    }

    public static double sum(ArrayList<? extends Number> list){
        double a = 0;

        for (Number n : list){
            a = a + n.doubleValue();
        }
        return a;
    }

}
