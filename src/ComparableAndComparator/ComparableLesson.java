package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableLesson {

    public static void main(String[] args) {
        // простая сортировка листа со стрингами
/*        List<String> list = new ArrayList<>();
        list.add("Zaur");
        list.add("Maria");
        list.add("Ivan");
        System.out.println("Before sort");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("After sort");
        System.out.println(list);*/

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(100, "Dima", "Ivanov", 15000));
        employeeList.add(new Employee(24, "Lexa", "Avrov", 77050));
        employeeList.add(new Employee(123, "Lexa", "Avrov", 34444));
        employeeList.add(new Employee(1, "Ashot", "Ebat", 222));


        // чтобы отсортировать объекты сначала нужно задать критерии для сравнения
        // нужно имплементировать интерфейс Comparable в классе, объекты которого будут сравниваться
        // и реализовать метод compareTo
        System.out.println("Before sort \n" + employeeList);
        Collections.sort(employeeList);
        System.out.println("After sort \n" + employeeList);

    }
}

//=======================================================================================================
class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", salary=" + salary +
            '}';
    }

    // несколько вариков реализации метода compareTo, в данном примере решили сравнивать объекты по их айди
    // первый варик
//    @Override
//    public int compareTo(Employee o) {
//        if (this.id == o.id) {
//            return 0;
//        } else if (this.id < o.id) {
//            return -1;
//        }else {
//            return 1;
//        }
//    }
    // второй варик
    // здесь если бы id был Integer то можно было бы написать такую реализацию
    // return this.id.compareTo(o.id); и сортировать можно по любому полю
//    @Override
//    public int compareTo(Employee o) {
//        return this.id - o.id;
//    }

//    @Override
//    public int compareTo(Employee o) {
//        int res = this.name.compareTo(o.name);
//        if (res == 0){
//            res = this.surname.compareTo(o.surname);
//        }
//        return res;
//    }

    @Override
    public int compareTo(Employee o) {
        int res = this.name.compareTo(o.name);
        if (res == 0){
            res = this.surname.compareTo(o.surname);
        }
        if (res == 0){
            res = this.salary - o.salary;
        }
        return res;
    }
}