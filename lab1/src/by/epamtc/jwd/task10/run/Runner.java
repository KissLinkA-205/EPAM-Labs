package by.epamtc.jwd.task10.run;

import by.epamtc.jwd.scanner.DataScanner;
import by.epamtc.jwd.task10.unit.FunctionLogic;
import by.epamtc.jwd.task10.unit.InputLogic;

public class Runner {
    public static void main(String[] args) {
        InputLogic input = new InputLogic();
        FunctionLogic functionAction = new FunctionLogic();
        double a, b, h;
        System.out.print("Введите границу вычисления a: ");
        a = DataScanner.enterDoubleFromConsole();

        System.out.print("Введите границу вычисления b: ");
        b = DataScanner.enterDoubleFromConsole();

        System.out.print("Введите шаг: ");
        h = input.inputStep();

        functionAction.calculateFunction(a, b, h);
    }

    public static void printFunction(double x, double result) {
        System.out.printf("\n%.3f", x);
        System.out.printf("   %.3f", result);
    }
}
