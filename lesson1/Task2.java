/**
 * leson 1, task2
 * Вывести все простые числа от 1 до 1000
 */

package lesson1;

public class Task2 {
    public static void main(String[] args) {
        for(int k = 2; k <= 1000; k++) {
            if (isPrime(k)) {
                System.out.println(k);
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
