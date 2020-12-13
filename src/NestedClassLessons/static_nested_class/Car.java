package NestedClassLessons.static_nested_class;

import java.util.Calendar;

public class Car {
    private String color;
    int doorCount;
    Engine engine;
    private static int a;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }
    // из внешнего класса можем обращаться к private static переменным внутреннего класса
    void method(){
        System.out.println(Engine.countOfObjects);
    }

    @Override
    public String toString() {
        return "Му сar{" +
            "color='" + color + '\'' +
            ", doorCount=" + doorCount +
            ", engine=" + engine +
            '}';
    }

    public static class Engine{ // внутрений static класс можно использовать ка обычный внешний класс только указать внешний класс Car.Engine
        int horsePower;
        static int countOfObjects;

        // из static nested класса мы можем обращаться только к статичным переменным внешнего класса даже private
        //и из внешнего класса можем обращаться к private static переменным

        public Engine(int horsePower) {
            System.out.println(a);
//            System.out.println(doorCount);
            this.horsePower = horsePower;
            countOfObjects++;
        }

        @Override
        public String toString() {
            return "My engine{" +
                "horsePower=" + horsePower +
                '}';
        }
    }
}
class Test{
    public static void main(String[] args) {
        //Engine engine = new Engine(256);  не канает
        Car.Engine engine = new Car.Engine(256);
        System.out.println(engine);

        Car car = new Car("red", 2, engine);
        System.out.println(car);
    }
}
