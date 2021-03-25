package task2.unit;

public class TrianleLogics {
    public static int numberOfDays(int year, int month) {
        int days;
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        } else if (month == 2) {
            if (checkLeapYear(year)) {
                days = 29;
            } else {
                days = 28;
            }
        } else {
            days = 31;
        }
        return days;
    }
    public static boolean checkLeapYear(int year) {
        return year % 4 == 0;
    }
}
