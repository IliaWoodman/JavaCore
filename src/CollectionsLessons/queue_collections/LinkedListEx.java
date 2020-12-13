package CollectionsLessons.queue_collections;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx { // т.к линкед лист реализует еще и интерефейс queue
// Queue Коллекция, хранящая последовательность элемнтов. Добавляется элемент в конец очерели, используется из начала очереди - правило FIFO
public static void main(String[] args) {
    Queue<String> queue = new LinkedList<>();

    queue.add("Max");
    queue.add("Dan");
    queue.add("Dima");
    queue.add("Vanya");
    queue.add("Sasha");
// offer по сути тоже самое что и add но если у queue поставить ограничение например в 4 элемента
// то про добавлении пятого элемента через add упадет експепшн а при добавлении через offer нет
//    queue.offer("Sasha");
    System.out.println(queue);
//    System.out.println(queue.remove());
//    System.out.println(queue.remove());
//    System.out.println(queue.remove());
//    System.out.println(queue.remove());
//    System.out.println(queue.remove());
  //  System.out.println(queue.remove());// тут уже вылетит ексепшн

//poll тоже самое что и remove
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());// а здесь вернется null
//element возвращает первый элемент из очереди
    System.out.println(queue.element());
//peek тоже самое что и element но без ексепшена


}
}
