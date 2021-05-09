package by.epamtc.jwd.task3.unit;

import by.epamtc.jwd.scanner.DataScanner;

public class InputLogic {
    public double inputSquare() {
        double square;
        do {
            square = DataScanner.enterDoubleFromConsole();
        } while (square <= 0);

        return square;
    }
}
