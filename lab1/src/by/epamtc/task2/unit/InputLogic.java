package by.epamtc.task2.unit;

import by.epamtc.scanner.DataScanner;

public class InputLogic {
    public int inputMonth() {
        int month;
        int beginMonth = 1;
        int endMonth = 12;
        do {
            month = DataScanner.enterIntFromConsole();
        } while (month < beginMonth || month > endMonth);

        return month;
    }
}
