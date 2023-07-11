package lesson5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task1 {

    static class PhoneDirectory {
        // HashMap для хранения пар: фамилия - список номеров
        private Map<String, List<String>> directory = new HashMap<>();

        // Метод для добавления номера телефона по фамилии
        public void add(String lastName, String phoneNumber) {
            // Если в справочнике уже есть запись с такой фамилией
            if (directory.containsKey(lastName)) {
                // Добавляем номер телефона в список номеров этой фамилии
                List<String> numbers = directory.get(lastName);
                numbers.add(phoneNumber);
            } else {
                // Если такой фамилии нет, создаем новый список номеров и добавляем его в справочник
                List<String> numbers = new ArrayList<>();
                numbers.add(phoneNumber);
                directory.put(lastName, numbers);
            }
        }

        // Метод для получения списка номеров по фамилии
        public List<String> get(String lastName) {
            return directory.get(lastName);
        }
    }

    public static void main(String[] args) {
        // Создаем экземпляр телефонного справочника
        PhoneDirectory directory = new PhoneDirectory();

        // Добавляем несколько номеров телефонов
        directory.add("Ivanov", "89123456789");
        directory.add("Ivanov", "89123456788");
        directory.add("Petrov", "89123456787");

        printDirectory(directory);
    }

    // Метод для вывода номеров телефонов из справочника
    public static void printDirectory(PhoneDirectory directory) {
        System.out.println("Номера Иванова: " + directory.get("Ivanov"));
        System.out.println("Номера Петрова: " + directory.get("Petrov"));
    }
}
