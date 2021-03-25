package task6.unit;

public class TrianleLogics {
    public static int convertToHours(int enteredSeconds) {
        return enteredSeconds / 3600;
    }

    public static int convertToMinuts(int enteredSeconds) {
        int hours = 0;
        hours = task6.unit.TrianleLogics.convertToHours(enteredSeconds);
        return (enteredSeconds - hours * 3600) / 60;
    }

    public static int convertToSeconds(int enteredSeconds) {
        int hours = 0, minuts = 0;
        hours = task6.unit.TrianleLogics.convertToHours(enteredSeconds);
        minuts = task6.unit.TrianleLogics.convertToMinuts(enteredSeconds);
        return enteredSeconds - minuts * 60 - hours * 3600;
    }
}
