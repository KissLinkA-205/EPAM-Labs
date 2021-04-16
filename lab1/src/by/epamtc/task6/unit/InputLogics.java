package by.epamtc.task6.unit;

import by.epamtc.scanner.DataScanner;

public class InputLogics {
    public static int inputSeconds() {
        int seconds;
        do {
            seconds = DataScanner.enterIntFromConsole();
        } while (seconds < 0);

        return seconds;
    }
}
