package by.epamtc.task5.run;

import by.epamtc.scanner.DataScanner;
import by.epamtc.task5.unit.NumberLogics;

public class Runner {
    public static void main(String[] args) {
        int number;
        System.out.print("Введите число: ");
        number = DataScanner.enterIntFromConsole();

        boolean result;
        result = NumberLogics.isPerfect(number);
        System.out.print(result);
    }
}
