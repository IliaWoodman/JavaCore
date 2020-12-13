package InputOutputStreams.programmer1;

import java.io.Serializable;

public class Employees implements Serializable {
    static final long serialVersionUID = 2;
    String name;
    String surname;
    String department;
//    int age;
    transient double salary; // это поле запишется но значение будет 0.0
    Car car;

    @Override
    public String toString() {
        return "Employees{" +
            "name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", department='" + department + '\'' +
            ", salary=" + salary +
            ", car=" + car +
            '}';
    }

    public Employees(String name, String surname, String department, double salary, Car car) {
        this.name = name;
        this.surname = surname;
        this.department = department;

        this.salary = salary;
        this.car = car;
    }
}
