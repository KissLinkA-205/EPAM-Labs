package by.epamtc.jwd.task6.unit;

import by.epamtc.jwd.scanner.DataScanner;

public class InputLogic {
    public int inputSeconds() {
        int seconds;
        do {
            seconds = DataScanner.enterIntFromConsole();
        } while (seconds < 0);

        return seconds;
    }
}
