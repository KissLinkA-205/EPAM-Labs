package by.epamtc.task9.unit;

import by.epamtc.scanner.DataScanner;

public class InputLogics {
    public static double inputRadius() {
        double radius;
        do {
            radius = DataScanner.enterDoubleFromConsole();
        } while (radius <= 0);

        return radius;
    }
}
