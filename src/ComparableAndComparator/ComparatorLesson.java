package ComparableAndComparator;

import java.util.*;

public class ComparatorLesson {
    public static void main(String[] args) {
        List<Employee1> employeeList = new ArrayList<>();

        employeeList.add(new Employee1(100, "Dima", "Ivanov", 15000));
        employeeList.add(new Employee1(24, "Lexa", "Avrov", 77050));
        employeeList.add(new Employee1(123, "Zivar", "Cop", 34444));
        employeeList.add(new Employee1(1, "Ashot", "Ebat", 222));


        // чтобы отсортировать объекты сначала нужно задать критерии для сравнения
        // здесь мы создаем отдельный класс IdComparator который имлементит интерфейс Comparator
        // и реализовать метод compare
        // плюс ко всему можно совместить Comparable и Comparator
        // по айди сортируем благодарю Comparable  и дополнительно создали пару компараторов на всякий случай
        // Comparator так же есть смысл создавать чтобы отсортировать в НЕ естественном порядке (напр. по убыванию)
        System.out.println("Before ID sort \n" + employeeList);
        Collections.sort(employeeList);
        System.out.println("After ID sort \n" + employeeList);

        System.out.println("Before NAME sort \n" + employeeList);
        Collections.sort(employeeList, new NameComparator());
        System.out.println("After NAME sort \n" + employeeList);

        System.out.println("Before SALARY sort \n" + employeeList);
        Collections.sort(employeeList, new SalaryComparator());
        System.out.println("After SALARY sort \n" + employeeList);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <100 ; i++) {
            list.add((int) (Math.random() * 100));
        }
    }
}

class Employee1 implements Comparable<Employee1> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee1(int id, String name, String surname, int salary) {
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

    @Override
    public int compareTo(Employee1 emp1) {
        return this.id - emp1.id;
    }
}

//class IdComparator implements Comparator<Employee1>{
//
//    @Override
//    public int compare(Employee1 emp1, Employee1 emp2) {
//        return emp1.id - emp2.id;
//    }
//}

class NameComparator implements Comparator<Employee1>{

    @Override
    public int compare(Employee1 emp1, Employee1 emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

class SalaryComparator implements Comparator<Employee1>{

    @Override
    public int compare(Employee1 emp1, Employee1 emp2) {
        return emp1.salary - emp2.salary;
    }

}

// метод для генерации случайного числа в заданом диапазоне
//    public int getRandomNumber(int min, int max) {
//        return (int) ((Math.random() * (max - min)) + min);
//    }