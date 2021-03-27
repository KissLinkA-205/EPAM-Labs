package by.epamtc.task1.run;

import by.epamtc.scanner.DataScanner;

public class Runner {
    public static void main(String... args) {
        int number;
        System.out.print("Введите число: ");
        number = DataScanner.enterIntFromConsole();
        
        int digit;
        digit = by.epamtc.task1.unit.TrianleLogics.lastDigit(number);

        number = by.epamtc.task1.unit.TrianleLogics.square(digit);
        digit = by.epamtc.task1.unit.TrianleLogics.lastDigit(number);
        System.out.println("Последняя цифра квадрата числа: " + digit);
    }
}
