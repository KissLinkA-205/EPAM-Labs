package by.epamtc.task8.run;

import by.epamtc.scanner.DataScanner;

public class Runner {
    public static void main(String... args) {

        double x;
        System.out.print("Введите x: ");
        x = DataScanner.enterDoubleFromConsole();

        double result;
        if (by.epamtc.task8.unit.TrianleLogics.comparisonWithThree(x)) {
            result = by.epamtc.task8.unit.TrianleLogics.functionGreaterThanTree(x);
        } else {
            result = by.epamtc.task8.unit.TrianleLogics.functionLessThanTree(x);
        }
        System.out.print("Результат вычисления значения функции: " + result);
    }
}
