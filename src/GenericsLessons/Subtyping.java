package GenericsLessons;

import java.util.ArrayList;
import java.util.List;

public class Subtyping {
    public static void main(String[] args) {
        X x = new Y();
        //так работает
       // List<X> list1 = new ArrayList<>();
        //так тоже
//      List<X> list1 = new ArrayList<X>();
        // а так нет, потому что ЭррейЛист с классом Y не является подтипом листа с классом Х
//      List<X> list1 = new ArrayList<Y>();

        //метоы для Интегер и Дабл отличаются и на уровне РанТайма падал бы эксепшн
//      List<Number> list2 = new ArrayList<Integer>();
//      list2.add(122);
//      list2.add(3.14);

        Chislo<Integer> chislo1= new Chislo<>(123);
        Chislo<Double> chislo2= new Chislo<>(3.14);
        Chislo<Long> chislo3= new Chislo<>(1238888888888888888L);
        System.out.println(chislo1);
        System.out.println(chislo2);
        System.out.println(chislo3);

        Chislo2<Z> chisloZ =new Chislo2<>(new Z());
        System.out.println(chisloZ);//Your chislo = Z{a='oooo'} // "Your chislo =" - это toString от Chislo2, а это "Z{a='oooo'" от Z
        System.out.println(chisloZ.getChislo());

    }
}
class X{

}
class Y extends X{

}

class Z extends X implements I1, I2{
private String a = "oooo";

    public String getA() {
        return a;
    }

    @Override
    public String toString() {
        return "Z{" + "a='" + a + '\'' + '}';
    }
}
//можно ограничить классы которые будут подходить под тит Т
//если не указывать extends то вместо Т будет подставляться Object и далее каститься для переданного класса в генерик
// здесь вместо Object подставиться Number
class Chislo<T extends Number> {
    private T chislo;
    public Chislo(T chislo) {
        this.chislo = chislo;
    }

    public T getChislo() {
        return chislo;
    }

    @Override
    public String toString() {
        return "Your chislo = " + chislo;
    }

    //так писать нельзя было бы, ниже вариант как можно было бы
//    public static <T> T getSecondElement(List<T extends Number> list){
//        return list.get(1);
//    }
    //так можно
//        public static <T extends Number> T getSecondElement(List<T> list){
//        return list.get(1);
//    }

}

interface I1{

}

interface I2{

}

//так же еще можно добавить имплементацию от интерфейсов
// класс должен идти на первом месте
class Chislo2<T extends X & I1 & I2> {
    private T chislo;
    public Chislo2(T chislo) {
        this.chislo = chislo;
    }

    public T getChislo() {
        return chislo;
    }

    @Override
    public String toString() {
        return "Your chislo = " + chislo;
    }
}
