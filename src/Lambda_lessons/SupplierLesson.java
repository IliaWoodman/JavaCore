package Lambda_lessons;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierLesson {
    /**
     * для интерфейса Supplier
     **/
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(carSupplier.get());
        }
        return list;
    }

    /**
     * для интерфейс Consumer
     **/

    public static void changeCar(Car car, Consumer<Car> carConsumer){
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        /**
         * для интерфейс Supplier
         **/
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("Nissan Tiida", "Silver", 1.6));
        System.out.println(ourCars);

        /**
         * для интерфейс Consumer
         **/
        changeCar(ourCars.get(0), car -> {car.color = "red"; car.engine = 2.4;
            System.out.println("upgraded car: " + car);});

        System.out.println(ourCars);

    }

}

class Car {
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Our cars: {" +
            "model='" + model + '\'' +
            ", color='" + color + '\'' +
            ", engine=" + engine +
            '}';
    }
}
