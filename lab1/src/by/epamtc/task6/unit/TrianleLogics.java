package by.epamtc.task6.unit;

import by.epamtc.scanner.DataScanner;

public class TrianleLogics {
    public static int convertToHours(int enteredSeconds) {
        return enteredSeconds / 3600;
    }

    public static int convertToMinuts(int enteredSeconds) {
        int hours = 0;
        hours = by.epamtc.task6.unit.TrianleLogics.convertToHours(enteredSeconds);
        return (enteredSeconds - hours * 3600) / 60;
    }

    public static int convertToSeconds(int enteredSeconds) {
        int hours = 0, minuts = 0;
        hours = by.epamtc.task6.unit.TrianleLogics.convertToHours(enteredSeconds);
        minuts = by.epamtc.task6.unit.TrianleLogics.convertToMinuts(enteredSeconds);
        return enteredSeconds - minuts * 60 - hours * 3600;
    }

    public static int inputSeconds() {
        int seconds;
        do {
            seconds = DataScanner.enterIntFromConsole();
        } while (seconds < 0);

        return seconds;
    }
}
