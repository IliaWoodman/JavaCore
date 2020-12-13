package Lambda_lessons;

public class Test2 {
    static void def(I i, String s){
        System.out.println(i.abc(s));
    }

    public static void main(String[] args) {
        def((String s) -> s.length(), "poka");
        def(String::length, "privet");
    }
}

interface I{
    int abc(String s);
}
