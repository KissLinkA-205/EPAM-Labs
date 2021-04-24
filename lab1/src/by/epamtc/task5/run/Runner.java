package by.epamtc.task5.run;

import by.epamtc.scanner.DataScanner;
import by.epamtc.task5.unit.NumberLogic;

public class Runner {
    public static void main(String[] args) {
        NumberLogic numberAction = new NumberLogic();

        int number;
        System.out.print("Введите число: ");
        number = DataScanner.enterIntFromConsole();

        boolean result;
        result = numberAction.isPerfect(number);
        System.out.print(result);
    }
}
