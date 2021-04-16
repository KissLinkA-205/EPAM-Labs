package by.epamtc.task2.unit;

import by.epamtc.scanner.DataScanner;

public class InputLogics {
    public static int inputMonth() {
        int month;
        do {
            month = DataScanner.enterIntFromConsole();
        } while (month < 1 || month > 12);

        return month;
    }
}
