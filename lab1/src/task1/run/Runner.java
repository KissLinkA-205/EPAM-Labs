package task1.run;

import scanner.DataScanner;

public class Runner {
    public static void main(String... args) {
        int number;
        System.out.print("Введите число: ");
        number = DataScanner.enterIntFromConsole();
        
        int digit;
        digit = task1.unit.TrianleLogics.last_digit(number);

        number = task1.unit.TrianleLogics.square(digit);
        digit = task1.unit.TrianleLogics.last_digit(number);
        System.out.println("Последняя цифра квадрата числа: " + digit);
    }
}
