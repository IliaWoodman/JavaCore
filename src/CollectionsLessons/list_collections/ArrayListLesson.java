package CollectionsLessons.list_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class ArrayListLesson {

    public static void main(String[] args) {
        String[] arr = new String[]{"Ivan", "Dima"};
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(arr));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Serege", "Petya", "Vanya"));
        list1.add("privet");
        list1.add("poka");
        list1.add("kak dela");
        System.out.println(list1);
        list1.add(0, "new element");
        System.out.println(list1);
        System.out.println(list1.get(1));
//set заменяет выбранный элемент на ново передаваемый
        list1.set(1, "replace element");
        System.out.println(list1);
//remove удаляет элемент
        list1.remove(1);
        System.out.println(list1);
        list1.remove("privet");// работает через equals
        System.out.println(list1);

        Student st1 = new Student(1, "Vanya", 23);
        Student st2 = new Student(2, "Dima", 42);
        Student st3 = new Student(3, "Serege", 32);
        Student st4 = new Student(4, "Perya", 18);
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st4);
        Student st5 = new Student(4, "Perya", 18);
        System.out.println(studentList);
//indexOf
        System.out.println(studentList.indexOf(st5));// если бы объекту st5 было ранвно несколько элементов то вывелось бы первое совпадение
//lastIndexOf
        System.out.println(studentList.lastIndexOf(st5));// а здесь последнее совпадение
//isEmpty
        System.out.println(studentList.isEmpty());//true если пустой лист
        studentList.remove(st5);
        System.out.println(studentList);

    }
}
    class Student{
        private int id;
        private String name;
        private int age;

        public Student(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return id == student.id &&
                age == student.age &&
                Objects.equals(name, student.name);
        }
    }

