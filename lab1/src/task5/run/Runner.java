package task5.run;

import scanner.DataScanner;

public class Runner {
    public static void main(String... args) {

        int number;
        System.out.print("Введите число: ");
        number = DataScanner.enterIntFromConsole();

        boolean result;
        result = task5.unit.TrianleLogics.checkPerfect(number);
        if (result) {
            System.out.print("true");
        } else System.out.print("false");
    }
}
