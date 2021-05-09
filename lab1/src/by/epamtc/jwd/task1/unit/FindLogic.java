package by.epamtc.jwd.task1.unit;

public class FindLogic {
    public int findLastDigit(int number) {
        int ten = 10;
        return number - (number / ten) * ten;
    }
}
