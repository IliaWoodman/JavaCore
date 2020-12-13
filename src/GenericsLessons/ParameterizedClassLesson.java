package GenericsLessons;

import java.util.ArrayList;
import java.util.List;

public class ParameterizedClassLesson {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("Privet");
        System.out.println(info1);//{[Privet]}

        Info<Integer> info2 = new Info<>(5);
        System.out.println(info2);//{[5]}

        Info<Double> info3 = new Info<>(3.14);
        System.out.println(info3.getValue());//3.14
        System.out.println(info3);//{[3.14]}

        PairInfo<Long, String> pair1 = new PairInfo<>(1l,"Ivan");
        System.out.printf("%s : %d \n", pair1.getValue2(), pair1.getValue1());//Ivan : 1

        PairInfo<Integer, Integer> pair2 = new PairInfo<>(2,5);
        System.out.printf("%d - %d \n", pair2.getValue1(), pair2.getValue2());//2 - 5

        PairInfo<String, Double> pair3 = new PairInfo<>("Number", 3.33);
        System.out.printf("This is %s: %.2f\n", pair3.getValue1(), pair3.getValue2()); //This is Number: 3,33


    }
}


//Ниже Generic Class
class Info<T> {
    private T value; // не может быть static


    public Info(T value) {
        this.value = value;
    }

    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue(){
        return value;
    }
}

//Ниже Generic Class с двумя placeholderами

class PairInfo<V1, V2>{
    private V1 value1;
    private V2 value2;

    public PairInfo(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getValue1() {
        return value1;
    }

    public V2 getValue2() {
        return value2;
    }
}