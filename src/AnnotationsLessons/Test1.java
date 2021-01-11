package AnnotationsLessons;

public class Test1 {
    public static void main(String[] args) {

    }
}

class Parent {
    String name;

    public Parent(String name) {
        this.name = name;
    }

    void showIngo() {
        System.out.println("It is parent class. Name = " + name);
    }
}

class Child extends Parent {

    public Child(String name) {
        super(name);
    }

    @Override
    void showIngo() {
        System.out.println("It is child class. Name = " + name);
    }
}
