/*
 * Реализуйте очередь с помощью LinkedList со следующими методами:
 * enqueue() - помещает элемент в конец очереди,
 * dequeue() - возвращает первый элемент из очереди и удаляет его,
 * first() - возвращает первый элемент из очереди, не удаляя.
 * Это задание повышенной сложности, для решения задачи потребуется 
 * создать класс-обертку над LinkedList, например:
 * class MyQueue {
 *     private LinkedList elements = new LinkedList();
 *     public MyQueue() { }
 *     public MyQueue(LinkedList linkedList) {
 *         this.elements = linkedList;
 *     }
 *         .........
 * }
 */
package lesson4;

import java.util.LinkedList;

class MyQueue<T> {
    private LinkedList<T> elements = new LinkedList<>();

    public MyQueue() {}

    public MyQueue(LinkedList<T> linkedList) {
        this.elements = linkedList;
    }

    // Метод помещает элемент в конец очереди
    public void enqueue(T element) {
        elements.addLast(element);
    }

    // Метод возвращает первый элемент из очереди и удаляет его
    public T dequeue() {
        return elements.pollFirst();
    }

    // Метод возвращает первый элемент из очереди, не удаляя его
    public T first() {
        return elements.peekFirst();
    }
}

public class Task2 {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        System.out.println(myQueue.first());  // выводит 1
        System.out.println(myQueue.dequeue());  // выводит 1
        System.out.println(myQueue.first());  // выводит 2
    }
}
