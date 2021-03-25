package task8.run;

import scanner.DataScanner;

public class Runner {
    public static void main(String... args) {

        double x;
        System.out.print("Введите x: ");
        x = DataScanner.enterDoubleFromConsole();

        double result;
        if (task8.unit.TrianleLogics.comparisonWithThree(x)) {
            result = task8.unit.TrianleLogics.functionGreaterThanTree(x);
        } else {
            result = task8.unit.TrianleLogics.functionLessThanTree(x);
        }
        System.out.print("Результат вычисления значения функции: " + result);
    }
}
