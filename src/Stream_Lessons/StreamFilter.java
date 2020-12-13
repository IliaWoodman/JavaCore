package Stream_Lessons;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {
        Man m1 = new Man("Ivan", 'm', 22, 3, 8.3);
        Man m2 = new Man("Nikolay", 'm', 28, 1, 6.4);
        Man m3 = new Man("Elena", 'f', 19, 1, 8.9);
        Man m4 = new Man("Petr", 'm', 25, 4, 7);
        Man m5 = new Man("Mariya", 'f', 23, 3, 7.4);

        List<Man> list = new ArrayList<>();
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);
        list.add(m5);

        List<Man> filter = list.stream().filter(el->el.getAge()>22 && el.getAvgGrade() <7.2).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(filter);
    }
}

class Man{
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Man(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }
}
