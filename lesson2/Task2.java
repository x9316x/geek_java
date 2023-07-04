/**
 * Реализуйте алгоритм сортировки пузырьком числового массива,
 * результат после каждой итерации запишите в лог-файл.
 */
package lesson2;

import java.io.PrintWriter;
import java.io.IOException;

public class Task2 {
    void bubbleSort(int arr[], String fileName) {
        int n = arr.length;
        try (PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
                writer.println(java.util.Arrays.toString(arr));
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }

    public static void main(String args[]) {
        Task2 bs = new Task2();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        bs.bubbleSort(arr, "log.txt");
    }
}
