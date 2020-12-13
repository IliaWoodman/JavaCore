package GenericsLessons;

import java.util.ArrayList;
import java.util.List;

public class ASD {

    public static void main(String[] args) {
        List<ABC> a = new ArrayList<>();
        a.add(new A());
        a.add(new B());
        a.add(new C());
for (ABC abc : a){
    abc.method();
}
    }
}

class ABC {
    public void method(){};

}

class A extends ABC {
    @Override
    public void method() {
        System.out.println("A");
    }
}

class B extends ABC {
    @Override
    public void method() {
        System.out.println("B");
    }
}

class C extends ABC {
    @Override
    public void method() {
        System.out.println("C");
    }
}
