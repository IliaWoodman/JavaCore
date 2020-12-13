package ReflectionLessons;

public class Emp33 {

    public int id;
    public String name;
    public String department;
    private double salary = 1000;

    public Emp33(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

//    public Emp33(int id, String name, String department, double salary) {
//        this.id = id;
//        this.name = name;
//        this.department = department;
//        this.salary = salary;
//    }

    public Emp33() {

    }

//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }

    private void changeDepartment(String department){
        this.department = department;
        System.out.println("new department is " + department);
    }

    public void increaseSalary(){
        salary*=2;
    }

    @Override
    public String toString() {
        return "Emp33{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", department='" + department + '\'' +
            ", salary=" + salary +
            '}';
    }
}
