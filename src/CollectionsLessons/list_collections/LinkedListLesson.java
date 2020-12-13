package CollectionsLessons.list_collections;

import java.util.LinkedList;
import java.util.Objects;

public class LinkedListLesson {
    public static void main(String[] args) {
        Student2 st1 = new Student2(1, "Vanya", 23);
        Student2 st2 = new Student2(2, "Dima", 42);
        Student2 st3 = new Student2(3, "Serege", 32);
        Student2 st4 = new Student2(4, "Perya", 18);

        LinkedList<Student2> student2List = new LinkedList<>();
        student2List.add(st1);
        student2List.add(st2);
        student2List.add(st3);
        student2List.add(st4);
        System.out.println("LinkedList = " + student2List);

        Student2 st5 = new Student2(5, "Sasha", 32);
        Student2 st6 = new Student2(6, "Max", 18);
        student2List.add(st5);
        student2List.add(st6);
    }
}

/*Элементы LinkedList - это звенья одной цепочки. Эти элементы хранят определенные данные
, а так же ссылки на предыдущий и следующий элементы
LinkedList знает где начало и где конец, если бы лист состоял из 100 элементов
 и нам нужно было бы достать 10 элемент то поиск начался бы с начала
 а если бы 87 елемент то поиск пошел бы с конца
 первый  элемент ссылается на один элемент и на null
  последний элемент также
  */

// ПРЕИМУЩЕСТВО LinkedList
// если часто будут операции добавления или удаления элементов, то LinkedList быстрее, особенно если в начале коллекции
//если часто будешь использоваться get то лучше использовать ArrayList, поиск гораздо быстрее
//но ArrayList применяется чаще

class Student2 {
    private int id;
    private String name;
    private int age;

    public Student2(int id, String name, int age) {
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
        Student2 student = (Student2) o;
        return id == student.id &&
            age == student.age &&
            Objects.equals(name, student.name);
    }
}
