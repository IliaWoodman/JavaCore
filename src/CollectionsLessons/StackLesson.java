package CollectionsLessons;

import java.util.Stack;

public class StackLesson {
    //Stack устаревший synchronized класс, наследник Vector. Не рекомендуется использовать
    // принцип последний пришел первый вышел
    // как стопка тарелок

    static void abc1(){
        System.out.println("abc1 starts");
        System.out.println("abc1 ends");
    }

    static void abc2(){
        System.out.println("abc2 starts");
        abc1();
        System.out.println("abc2 ends");
    }

    static void abc3(){
        System.out.println("abc3 starts");
        abc2();
        System.out.println("abc3 ends");
    }

    public static void main(String[] args) {
//        System.out.println("main starts");
//        abc3();
//        System.out.println("main ends");

        Stack<String> stack = new Stack<>();
//push аналог add
        stack.push("sasha");
        stack.push("dima");
        stack.push("zaur");
        stack.push("ivan");
        System.out.println(stack);
//pop возвращается последний эдемент и удаляет его из стека
/*        System.out.println(stack.pop());
        System.out.println(stack);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
            System.out.println(stack);
        }*/
//peek возвращает последний элемент но не удаляет его
        System.out.println(stack.peek());
    }
}
