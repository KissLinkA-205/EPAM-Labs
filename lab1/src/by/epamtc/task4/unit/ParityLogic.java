package by.epamtc.task4.unit;

public class ParityLogic {
    public boolean isParity(int numberA, int numberB, int numberC, int numberD) {
        int counter = 0;
        int two = 2;
        if (numberA % two == 0) {
            counter++;
        }
        if (numberB % two == 0) {
            counter++;
        }
        if (numberC % two == 0) {
            counter++;
        }
        if (numberD % two == 0) {
            counter++;
        }
        return counter >= two;
    }
}
