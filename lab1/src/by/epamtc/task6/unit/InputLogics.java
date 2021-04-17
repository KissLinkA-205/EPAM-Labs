package by.epamtc.task6.unit;

import by.epamtc.scanner.DataScanner;

public class InputLogics {
    public int inputSeconds() {
        int seconds;
        do {
            seconds = DataScanner.enterIntFromConsole();
        } while (seconds < 0);

        return seconds;
    }
}
