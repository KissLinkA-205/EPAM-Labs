package by.epamtc.task10.unit;

import by.epamtc.scanner.DataScanner;

public class InputLogics {
    public static double inputStep() {
        double h;
        do {
            h = DataScanner.enterDoubleFromConsole();
        } while (h <= 0);

        return h;
    }
}
