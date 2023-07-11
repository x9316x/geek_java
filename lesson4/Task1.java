/*
 * Пусть дан LinkedList с несколькими элементами.
 * Реализуйте метод, который вернет “перевернутый” список.
 */
package lesson4;

import java.util.*;

public class Task1 {

    // Метод для "переворачивания" LinkedList
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
        // Создаем новый LinkedList
        LinkedList<Integer> reversedList = new LinkedList<>();

        // Получаем итератор, который обходит список в обратном порядке
        Iterator<Integer> iterator = list.descendingIterator();

        // Обходим список и добавляем каждый элемент в новый список
        while(iterator.hasNext()) {
            reversedList.add(iterator.next());
        }

        // Возвращаем новый "перевернутый" список
        return reversedList;
    }

    public static void main(String[] args) {
        // Создаем новый LinkedList и добавляем в него несколько элементов
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // "Переворачиваем" список
        LinkedList<Integer> reversedList = reverseLinkedList(list);

        // Выводим "перевернутый" список на экран
        System.out.println(reversedList);
    }
}
