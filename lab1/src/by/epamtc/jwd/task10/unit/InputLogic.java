package by.epamtc.jwd.task10.unit;

import by.epamtc.jwd.scanner.DataScanner;

public class InputLogic {
    public double inputStep() {
        double h;
        do {
            h = DataScanner.enterDoubleFromConsole();
        } while (h <= 0);

        return h;
    }
}
