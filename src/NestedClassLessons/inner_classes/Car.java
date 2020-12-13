package NestedClassLessons.inner_classes;

public class Car {
    private String color;
    int doorCount;
    Engine1 engine;
    private static int a;

    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
//        this.engine = this.new Engine1(horsePower); // так создается объект внутреннего класса
    }

    public void setEngine(Engine1 engine){
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Му сar{" +
            "color='" + color + '\'' +
            ", doorCount=" + doorCount +
            ", engine=" + engine +
            '}';
    }

    public class Engine1{ // если нужно создать объект внутреннего класса, сначала нужно создать объект внешнего
        //inner class может содержать только non static элементы
        // но можно так
        public static final int A = 5;
        int horsePower;


        public Engine1(int horsePower) {
            this.horsePower = horsePower;
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
        Car car = new Car("black", 4);
        System.out.println(car);//Му сar{color='black', doorCount=4, engine=null}
//        Car.Engine1 engine1 = car.new Engine1(1500);
        car.setEngine(car.new Engine1(1500));
        System.out.println(car);//Му сar{color='black', doorCount=4, engine=My engine{horsePower=1500}}

        Car.Engine1 engine2 = new Car("qwe", 3).new Engine1(200);// но тогда нет ссылки на машину
    }
}
