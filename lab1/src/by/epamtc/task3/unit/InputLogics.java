package by.epamtc.task3.unit;

import by.epamtc.scanner.DataScanner;

public class InputLogics {
    public static double inputSquare() {
        double square;
        do {
            square = DataScanner.enterDoubleFromConsole();
        } while (square <= 0);

        return square;
    }
}
