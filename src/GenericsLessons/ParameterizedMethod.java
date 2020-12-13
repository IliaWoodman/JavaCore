package GenericsLessons;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParameterizedMethod {
    public static void main(String[] args) {

        //List<String> list = Arrays.asList("privet", "rrfr");
        List<String> list1 = new ArrayList<>();
        list1.add("priv");
        list1.add("kak ti");
        list1.add("vou");

        System.out.println(GenMethod.getSecondElement(list1)); //vou
        System.out.println(GenMethod.newMethod(list1, 1));//You return next class - java.lang.String

        List<Integer> list2 = new ArrayList<>();
        list2.add(333);
        list2.add(543);
        list2.add(132435);

        System.out.println(GenMethod.getSecondElement(list2)); //543

        System.out.println(GenMethod.newMethod(list2, 1));//You return next class - java.lang.Integer

    }
}

class GenMethod{
    //Generic method может быть и статик и не статик
    // <T> - говорит что мы используем Генерик в методе, а вторая Т тип возвращаемого значения
    public static <T> T getSecondElement(List<T> list){
        return list.get(1);
    }
    //хз зачем это метод прост на память
    public static <T> String newMethod(List<T>list, int number){
        return String.format("You return next class - %s", list.get(number).getClass().getName());
    }

    //так не работает
//    public static  String newMethod(List<T>list, int number){
//        return String.format("You return next class - %s", list.get(number).getClass().getName());
//    }
}

class GenMethod2<T>{
    // тут можно обойтись без <T> так как мы указали это в названии класса
    // Для статик метода не работает так
    public <T> T abc (T val){
        return val;
    }

    public T qwe (T val){
        return val;
    }

}