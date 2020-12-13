package NestedClassLessons.anonymous_class;

public class AnonymousClassLesson {
    //анонимный класс не имеет имени
    //аноним. класс - это объявление класса и создание объекта одновременно
    // в аноним классах нельзя написать конструктор
    // аноним класс может обращаться даже к приват элементам внешнего класса
    // лямбда выражений - это краткая форма для написания анонимных классов
    private int c = 50;
    public static void main(String[] args) {

      //анонимный класс от интерфейса
        Math1 m = new Math1() {
            int c = 10;
            void abc(){
                System.out.println("privet");
            }
            @Override
            public int doOperation(int a, int b) {
                return a + b + new AnonymousClassLesson().c;
            }
        };

     //анонимный класс от класса
        Eng eng = new Eng(){
            @Override
            String talk(){
                return "poka";
            }
        };


        System.out.println(m.doOperation(3,5));
    }
}

interface Math1 {
    int doOperation(int a, int b);
}

class Eng{
    String talk(){
        return "privet";
    }
}