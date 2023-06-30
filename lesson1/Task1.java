/**
 * lesson 1, task1
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */

package lesson1;

import java.util.Scanner;
import java.math.BigInteger;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите n:");
        int n = scanner.nextInt();
        scanner.close();
        
        int sum = 0;
        BigInteger prod = BigInteger.ONE;
        for(int i = 1; i <= n; i++) {
            sum = sum + i;
            prod = prod.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Сумма чисел:");
        System.out.println(sum);
        System.out.println("Произведение чисел:");
        System.out.println(prod);
    }
}
