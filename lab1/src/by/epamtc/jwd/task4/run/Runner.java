package by.epamtc.jwd.task4.run;

import by.epamtc.jwd.scanner.DataScanner;
import by.epamtc.jwd.task4.unit.ParityLogic;

public class Runner {
    public static void main(String[] args) {
        ParityLogic parityAction = new ParityLogic();

        int A, B, C, D;
        System.out.print("Введите число A: ");
        A = DataScanner.enterIntFromConsole();

        System.out.print("Введите число B: ");
        B = DataScanner.enterIntFromConsole();

        System.out.print("Введите число C: ");
        C = DataScanner.enterIntFromConsole();

        System.out.print("Введите число D: ");
        D = DataScanner.enterIntFromConsole();

        boolean result = parityAction.isParity(A, B, C, D);
        System.out.print(result);
    }
}
