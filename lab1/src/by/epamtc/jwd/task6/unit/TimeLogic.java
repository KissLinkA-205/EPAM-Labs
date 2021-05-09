package by.epamtc.jwd.task6.unit;

public class TimeLogic {
    public int convertToHours(int enteredSeconds) {
        return enteredSeconds / 3600;
    }

    public int convertToMinutes(int enteredSeconds) {
        int hours = 0;
        hours = convertToHours(enteredSeconds);
        return (enteredSeconds - hours * 3600) / 60;
    }

    public int convertToSeconds(int enteredSeconds) {
        int hours = 0, minutes = 0;
        hours = convertToHours(enteredSeconds);
        minutes = convertToMinutes(enteredSeconds);
        return enteredSeconds - minutes * 60 - hours * 3600;
    }
}
