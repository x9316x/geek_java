/**
 * leson 1, task3
 * Реализовать простой калькулятор
 */

package lesson1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Введите первое число");
        double firstArg =  scanner.nextDouble();
        
        System.out.println("Введите второе число");
        double secondArg =  scanner.nextDouble();

        System.out.println("Введите номер операции, которую вы хотите произвести?");
        System.out.println("1: * - умножение");
        System.out.println("2: / - деление");
        System.out.println("3: + - сложение");
        System.out.println("4: - - вычитание");
        int operation =  scanner.nextInt();
                     
        scanner.close();

        System.out.println("Результат");
        
        if (operation == 1) {
            System.out.println(firstArg * secondArg );
        }
        else if (operation == 2) {
            if (secondArg == 0) {
                System.out.println("Деление на ноль невозможно!");
            } else {
                System.out.println(firstArg / secondArg );
            }
        }
        else if (operation == 3) {
            System.out.println(firstArg + secondArg );
        }
        else if (operation == 4) {
            System.out.println(firstArg - secondArg );
        }
        else {
            System.out.println("Данная операция не поддерживается!");
        }
    }
}
