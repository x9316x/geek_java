/*
 * В калькулятор (урок 1 и 2) добавьте
 * возможность отменить последнюю операцию
 */
package lesson4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Инициализируем переменные для текущего и предыдущего результатов
        double result = 0.0;
        double prevResult = 0.0;

        while (true) {
            System.out.println("Введите первое число");
            double firstArg =  scanner.nextDouble();

            System.out.println("Введите второе число");
            double secondArg =  scanner.nextDouble();

            System.out.println("Введите номер операции, которую вы хотите произвести?");
            System.out.println("1: * - умножение");
            System.out.println("2: / - деление");
            System.out.println("3: + - сложение");
            System.out.println("4: - - вычитание");
            System.out.println("5: Отменить последнюю операцию");
            int operation =  scanner.nextInt();

            // Если пользователь выбрал отмену последней операции
            if (operation == 5) {
                // Восстанавливаем результат из предыдущего результата
                result = prevResult;
                System.out.println("Последняя операция отменена");
            } else {
                // Иначе сохраняем текущий результат в prevResult перед выполнением новой операции
                prevResult = result;

                // Выполняем выбранную пользователем операцию
                switch (operation) {
                    case 1:
                        // Умножение
                        result = firstArg * secondArg;
                        break;
                    case 2:
                        // Деление (с проверкой на деление на ноль)
                        if (secondArg == 0) {
                            System.out.println("Деление на ноль невозможно!");
                        } else {
                            result = firstArg / secondArg;
                        }
                        break;
                    case 3:
                        // Сложение
                        result = firstArg + secondArg;
                        break;
                    case 4:
                        // Вычитание
                        result = firstArg - secondArg;
                        break;
                    default:
                        // В случае, если введенная операция не поддерживается
                        System.out.println("Данная операция не поддерживается!");
                }
            }

            System.out.println("Результат: " + result);

            System.out.println("Хотите продолжить? (y/n)");
            String continueChoice = scanner.next();

            if (continueChoice.equalsIgnoreCase("n")) {
                // Закрываем сканнер перед выходом из программы
                scanner.close();
                break;
            }
        }
    }
}
