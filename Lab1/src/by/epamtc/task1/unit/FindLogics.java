package by.epamtc.task1.unit;

public class FindLogics {
    public static int findLastDigit(int number) {
        int ten = 10;
        return number - (number / ten) * ten;
    }
}
