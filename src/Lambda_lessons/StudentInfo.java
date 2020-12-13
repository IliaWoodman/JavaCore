package Lambda_lessons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentInfo {
    // Переопределим метод для интерфейса Predicate. По факту все работает также как и наш метод check()
    void testStudents(ArrayList<Student> a1, Predicate<Student> pr) {
        for (Student s : a1) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }

    }

    // для интерфейса Function
    public static double avgOfSmth(List<Student> list, Function<Student, Double> f) {
        double result = 0;
        for (Student st : list) {
            result = result + f.apply(st);
        }

        result = result / list.size();
        return result;
    }



//    void testStudents(ArrayList<Student> a1, StudentChecks sc) {
//        for (Student s : a1) {
//            if (sc.check(s)) {
//                System.out.println(s);
//            }
//        }
//
//    }

//    void printStudentsOverGrade(ArrayList<Student> a1, double grade) {
//        for (Student s : a1) {
//            if (s.avgGrade > grade) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsUnderAge(ArrayList<Student> a1, int age) {
//        for (Student s : a1) {
//            if (s.age < age) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsMixCondition(ArrayList<Student> a1, int age, double grade, char sex) {
//        for (Student s : a1) {
//            if (s.age > age && s.avgGrade < grade && s.sex == sex) {
//                System.out.println(s);
//            }
//        }
//    }
}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivav", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Maria", 'f', 23, 3, 9.1);


        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        //  через анонимный класс
//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.course - o2.course;
//            }
//        });
        // через лямбду
//        Collections.sort(students, (s1, s2) -> s1.course - s2.course);


        StudentInfo studentInfo = new StudentInfo();
//        studentInfo.testStudents(students, new CheckOverGrade());
//        System.out.println("-----------------------------------------");
//        // через анонимный класс
//        studentInfo.testStudents(students, new StudentChecks() {
//            @Override
//            public boolean check(Student s) {
//                return s.age < 30;
//            }
//        });
//        System.out.println("-----------------------------------------");
        //через лямбду
        // лямбда выражение должно соответствовать методу check() оно должно принимать Student, возвращать boolean
        // в лямбда выражении оператор стрелка раздлеяет параметры метода и тело метода
        // справа от стрелки находится тело метода, которое было бы у метода соответствующего класса, реализующего
        // наш интерфейс с единственным методом
        // левая часть выражения может быть написана в краткой форме только если метод интерфейса принимает 1 параметр
        // Но если метод принимает 1 параметр но мы хотим писать его вместе с типом данных, то нужно писать это в скобках
        // если в правой части нужно использовать больше одного statement-а то нужно использовать фигурные скобки
//        studentInfo.testStudents(students, (Student std) -> {
//            System.out.println("Hello world");
//            return std.age < 30;
//        });
//        System.out.println("-----------------------------------------");
//        studentInfo.testStudents(students, std -> {
//            return std.avgGrade > 8;
//        });
//        System.out.println("-----------------------------------------");
//        studentInfo.testStudents(students, std -> std.avgGrade > 8 && std.age < 30 && std.sex == 'f');
//
//        // так же лямбда выражение можно записать в переменную
//        StudentChecks scs = std -> std.avgGrade > 8;
//        studentInfo.testStudents(students, scs);

        // еесли метод не принимает аргумент то записть будет выглядеть так " () -> 18 "
//        studentInfo.testStudents(students, std -> std.avgGrade > 8 && std.age <30 && std.sex == 'f');
//        studentInfo.printStudentsOverGrade(students,8);
//        System.out.println("-----------------------------------------");
//        studentInfo.printStudentsUnderAge(students,30);
//        System.out.println("-----------------------------------------");
//        studentInfo.printStudentsMixCondition(students, 20, 9.5, 'f');

        /**
         * Интерфейс Predicate
         *  используется в методе removeIf
         **/
        Predicate<Student> p1 = student -> student.avgGrade > 7.5;
        Predicate<Student> p2 = student -> student.sex == 'm';

        studentInfo.testStudents(students, p1.and(p2));
        studentInfo.testStudents(students, p1.or(p2));
        studentInfo.testStudents(students, p1.negate()); // антоним

        /**
         * Интерфейс Function
         **/
        Function<Student, Double> f = student -> student.avgGrade; // для примера
        double res = StudentInfo.avgOfSmth(students, student -> student.avgGrade);

    }

}

// функциональный интерефейс содержит только один абстрактный метод
interface StudentChecks {
    boolean check(Student s);
}

class CheckOverGrade implements StudentChecks {
    @Override
    public boolean check(Student s) {
        return s.avgGrade > 8;
    }
}
