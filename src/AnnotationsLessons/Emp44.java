package AnnotationsLessons;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Emp44 {
    String name;
    double salary;

    public Emp44(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    @MyAnnotation
    void increaseSalary(){
        salary*=2;
    }

    @Override
    public String toString() {
        return "Emp44{" +
            "name='" + name + '\'' +
            ", salary=" + salary +
            '}';
    }


}
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR}) // аннотация таргет показывает область кода, к которой Аннотация может быть применима
@Retention(RetentionPolicy.RUNTIME) // описывает жизненный цикл Аннотации
@interface MyAnnotation{ // - так создаются аннотации

}
