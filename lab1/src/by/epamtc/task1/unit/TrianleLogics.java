package by.epamtc.task1.unit;

public class TrianleLogics {
    public static int findLastDigit(int number) {
        int ten = 10;
        return number - (number / ten) * ten;
    }

    public static int calculateSquare(int number) {
        return number * number;
    }
}
