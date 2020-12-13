package GenericsLessons;

import java.util.ArrayList;
import java.util.List;

public class TypeErasure {
    public static void main(String[] args) {

    //TypeErasure - это стирание типов сделанное для обратной совместимости новой java и более старой
    // где еще не поддерживались Generics
    //ниже пример как будет воспрониматься во время RunTime т.е инфа о генериках после компиляции стирается
    List<String> list1 = new ArrayList<>();
    //List list1 = new ArrayList();  так JVM видит запись выше
    String a = list1.get(0);
    //String a = (String)list1.get(0) возвращается объект который каститься в данном случае до стринга
    }

    public void abc (Info<String> info){
        String s = info.getValue();
    }
//вместе эти методы не могут существовать так как для JVM они выглядят одинаково

//    public void abc (Info<Integer> info){
//        Integer s = info.getValue();
//    }
}

//так же не получится сделать оверайд метода public void abc (Info<String> info) в дочернем классе
//так как инфа о генериках стирается и он хз

class Parent{
    public void abc (Info<String> info){
        String s = info.getValue();
    }
}

//class Child extends Parent{
//    public void abc (Info<Integer> info){
//        Integer s = info.getValue();
//    }
//}
