package by.epamtc.task8.run;

import by.epamtc.scanner.DataScanner;
import by.epamtc.task8.unit.FunctionLogics;

public class Runner {
    public static void main(String[] args) {
        FunctionLogics functionAction = new FunctionLogics();

        double x;
        System.out.print("Введите x: ");
        x = DataScanner.enterDoubleFromConsole();

        double result;
        result = functionAction.defineFunction(x);
        System.out.print("Результат вычисления значения функции: " + result);
    }
}
