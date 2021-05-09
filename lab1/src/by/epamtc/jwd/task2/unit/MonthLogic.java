package by.epamtc.jwd.task2.unit;

public class MonthLogic {
    public int discoverNumberOfDays(int year, int month) {
        YearLogic yearAction = new YearLogic();

        int days;
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        } else if (month == 2) {
            if (yearAction.isLeapYear(year)) {
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
