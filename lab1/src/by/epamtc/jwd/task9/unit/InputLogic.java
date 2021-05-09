package by.epamtc.jwd.task9.unit;

import by.epamtc.jwd.scanner.DataScanner;

public class InputLogic {
    public double inputRadius() {
        double radius;
        do {
            radius = DataScanner.enterDoubleFromConsole();
        } while (radius <= 0);

        return radius;
    }
}
