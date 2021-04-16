package by.epamtc.task6.unit;

public class TimeLogics {
    public static int convertToHours(int enteredSeconds) {
        return enteredSeconds / 3600;
    }

    public static int convertToMinutes(int enteredSeconds) {
        int hours = 0;
        hours = TimeLogics.convertToHours(enteredSeconds);
        return (enteredSeconds - hours * 3600) / 60;
    }

    public static int convertToSeconds(int enteredSeconds) {
        int hours = 0, minutes = 0;
        hours = TimeLogics.convertToHours(enteredSeconds);
        minutes = TimeLogics.convertToMinutes(enteredSeconds);
        return enteredSeconds - minutes * 60 - hours * 3600;
    }
}
