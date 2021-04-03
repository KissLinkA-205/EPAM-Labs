package by.epamtc.task5.run;

import by.epamtc.scanner.DataScanner;

public class Runner {
    public static void main(String[] args) {
        int number;
        System.out.print("Введите число: ");
        number = DataScanner.enterIntFromConsole();

        boolean result;
        result = by.epamtc.task5.unit.TrianleLogics.isPerfect(number);
        System.out.print(result);
    }
}
