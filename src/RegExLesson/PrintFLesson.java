package RegExLesson;

public class PrintFLesson {
    static void emploueeInfo(Employee employee){
        System.out.printf("%03d \t %-12s \t %-12s \t %,.2f \n", employee.id, employee.name, employee.surname, employee.salary*(1+employee.bonusPct));
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"Zaur", "Tregulov", 12345, 0.15);
        Employee emp2 = new Employee(15,"Ivan", "Petrob", 6543, 0.08);
        Employee emp3 = new Employee(123,"Marya", "Sidorova", 8564, 0.12);
        emploueeInfo(emp1);
        emploueeInfo(emp2);
        emploueeInfo(emp3);

        String s = String.format("%03d \t %-2s \t %-2s \t %,.2f \n", 1, "zaur", "tregulov", 123345*1.15);
        System.out.println(s);
    }
}

class Employee {
    int id;
    String name;
    String surname;
    int salary;
    double bonusPct;

    public Employee(int id, String name, String surname, int salary, double bonusPct) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonusPct = bonusPct;
    }
}