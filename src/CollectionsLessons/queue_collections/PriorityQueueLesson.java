package CollectionsLessons.queue_collections;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueLesson {
    // PriorityQueue - это специальный вид очереди в котором используется
    // натуральная сортировка или та, которую мы описываем с помощью Comparable или Comparator.
    // Таким образом изпользуется тот элемент из очереди, приоритет которого выше
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(3);
        priorityQueue.add(7);
        priorityQueue.add(2);
        priorityQueue.add(9);

        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());

        PriorityQueue<Student2> studentQueue = new PriorityQueue<>();

        Student2 st1 = new Student2("df", 33);
        Student2 st2 = new Student2("df", 534);
        Student2 st3 = new Student2("df", 134);
        Student2 st4 = new Student2("df", 12);
        Student2 st5 = new Student2("df", 5643);

        studentQueue.add(st1);
        studentQueue.add(st2);
        studentQueue.add(st3);
        studentQueue.add(st4);
        studentQueue.add(st5);
        System.out.println(studentQueue.remove());
        System.out.println(studentQueue.remove());
        System.out.println(studentQueue.remove());
        System.out.println(studentQueue.remove());
        System.out.println(studentQueue.remove());

    }
}

class Student2 implements Comparable<Student2>{

    String name;
    int age;

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student2 = (Student2) o;
        return age == student2.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    @Override
    public String toString() {
        return "Student2{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }

    @Override
    public int compareTo(Student2 o) {
        return this.age - o.age;
    }
}


