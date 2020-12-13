package CollectionsLessons.queue_collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeLesson {
    // Deque - double ended queue (двунаправленная очередь). В такой очереди элементы могут использоваться с обоих концов
    // Здесь работают оба правила - FIFO и LIFO

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(332);
        deque.addLast(13);
        deque.offerFirst(24);
        deque.offerLast(5324);
        System.out.println(deque);
        deque.removeLast();
        deque.removeFirst();
        deque.pollFirst();
        deque.pollLast();
        System.out.println(deque);
    }
}
