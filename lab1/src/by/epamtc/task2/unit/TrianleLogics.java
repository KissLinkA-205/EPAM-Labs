package by.epamtc.task2.unit;

import by.epamtc.scanner.DataScanner;

public class TrianleLogics {
    public static int discoverNumberOfDays(int year, int month) {
        int days = 0;
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        } else if (month == 2) {
            if (isLeapYear(year)) {
                days = 29;
            } else {
                days = 28;
            }
        } else {
            days = 31;
        }
        return days;
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0;
    }

    public static int inputMonth() {
        int month = 0;
        do {
            month = DataScanner.enterIntFromConsole();
        } while (month < 1 || month > 12);

        return month;
    }
}
