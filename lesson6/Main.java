package lesson6;

import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Set<Cat> cats = new HashSet<>();

        cats.add(new Cat("Murka", 3, "Black"));
        cats.add(new Cat("Stepa", 2, "White"));
        cats.add(new Cat("Barsik", 4, "Grey"));
        cats.add(new Cat("Barsik", 4, "Red"));
        cats.add(new Cat("Barsik", 4, "Grey")); // Дубликат

        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }
}
