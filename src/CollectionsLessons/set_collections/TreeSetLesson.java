package CollectionsLessons.set_collections;

import java.util.*;

public class TreeSetLesson {

    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(444);
        treeSet.add(0);
        treeSet.add(66);
//        treeSet.add(null);  ексепшн будет
        System.out.println(treeSet);


        Student1 st1 = new Student1("asd", 33);
        Student1 st2 = new Student1("fsdd", 21);
        Student1 st3 = new Student1("rterv", 43);
        Student1 st4 = new Student1("befv", 38);
        Student1 st5 = new Student1("btew", 18);
        Student1 st6 = new Student1("bgdf", 27);
        Student1 st7 = new Student1("bgdf", 27);

        TreeSet<Student1> student1TreeSet = new TreeSet<>(new Comparator<Student1>() {
            @Override
            public int compare(Student1 o1, Student1 o2) {
                return o1.age - o2.age;
            }
        });

        student1TreeSet.add(st1);
        student1TreeSet.add(st2);
        student1TreeSet.add(st3);
        student1TreeSet.add(st4);
        student1TreeSet.add(st5);
        System.out.println(student1TreeSet);
        System.out.println(student1TreeSet.first());
        System.out.println(student1TreeSet.last());
        System.out.println(student1TreeSet.headSet(st6));//[Student1{name='btew', age=18}, Student1{name='fsdd', age=21}]
        System.out.println(student1TreeSet.tailSet(st6));//[Student1{name='asd', age=33}, Student1{name='befv', age=38}, Student1{name='rterv', age=43}]
        System.out.println(student1TreeSet.subSet(st2,st4));//[Student1{name='fsdd', age=21}, Student1{name='asd', age=33}]

        System.out.println(st6.equals(st7));
        System.out.println(st6.hashCode() == st7.hashCode());

    }
}

    class Student1{

        String name;
        int age;

        public Student1(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student1 student1 = (Student1) o;
            return age == student1.age;
        }

        @Override
        public int hashCode() {
            return Objects.hash(age);
        }
    }

