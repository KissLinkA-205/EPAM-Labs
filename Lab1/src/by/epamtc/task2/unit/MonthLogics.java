package by.epamtc.task2.unit;

public class MonthLogics {
    public static int discoverNumberOfDays(int year, int month) {
        int days;
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        } else if (month == 2) {
            if (YearLogics.isLeapYear(year)) {
                days = 29;
            } else {
                days = 28;
            }
        } else {
            days = 31;
        }
        return days;
    }
}
