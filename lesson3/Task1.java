/**
 * lesson 3, task1
 * Пусть дан произвольный список целых чисел.
 * 1) Нужно удалить из него чётные числа
 * 2) Найти минимальное значение
 * 3) Найти максимальное значение
 * 4) Найти среднее значение
 */

package lesson3;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 7, 20, 15, 22, 10, 18, 5, 2));

        // Удаление чётных чисел из списка
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            if (num % 2 == 0) {
                iterator.remove();
            }
        }

        // Проверка на пустой список после удаления
        if (numbers.isEmpty()) {
            System.out.println("В списке нет нечётных чисел");
            return;
        }

        // Поиск минимального и максимального значения
        Integer min = numbers.get(0);
        Integer max = numbers.get(0);
        Integer sum = 0;
        for (Integer num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            sum += num;
        }

        // Подсчёт среднего значения
        double average = (double) sum / numbers.size();

        // Вывод результатов
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + average);
    }
}