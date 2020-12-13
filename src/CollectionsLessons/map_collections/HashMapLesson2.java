package CollectionsLessons.map_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapLesson2 {
    //хорошим тоном считается если переопределятся equals то переопределить и hashCode
    public static void main(String[] args) {
        Map<Human, Double> map = new HashMap<>();
        Human h1 = new Human("ivan", "petrov", 21);
        Human h2 = new Human("dima", "ivanov", 45);
        Human h3 = new Human("serega", "sidorov", 32);
        Human h4 = new Human("petya", "petuhov", 19);
        Human h5 = new Human("sasha", "putin", 78);

        map.put(h1, 8999.90);
        map.put(h2, 45342.88);
        map.put(h3, 534.90);
        map.put(h4, 134324.43);
        map.put(h5, 5342.92);
        System.out.println(map);

        Human h6 = new Human("ivan", "petrov", 21);

        boolean result = map.containsKey(h6);
        System.out.println(result); //true а если не переопределить метод hashCode то будет false
        // дело в том что для поиска используется сначала хеширование а потом equals, поэтому нужно переопределять оба метода
        // хеширование это преобразование любого объекта в int
        // hashCode обязательно переопределять для HashMap и HashSet
        // когда возвращается одинаковый hashCode для разный объектов это называется коллизии
        System.out.println(h1.hashCode());

        Human h7 = new Human("asd" , "dfgsdf", 35);


    }
}



class Human implements Comparable<Human>{
    String name;
    String surname;
    int age;

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
            "name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", age=" + age +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age &&
            Objects.equals(name, human.name) &&
            Objects.equals(surname, human.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }

    @Override
    public int compareTo(Human o) {
        return this.name.compareTo(o.name);
    }

    // можно написать самому
//    @Override
//    public int hashCode() {
//        return name.length() * 23 + surname.length() *3 + age * 933;
//    }

    // если equals для двух объектов возвращает true то и hashCode должен быть одинаковым
    // а если согласно equals объекты не равны то hashCode может быть одинаковым
}
