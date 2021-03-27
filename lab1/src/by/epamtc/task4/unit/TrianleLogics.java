package by.epamtc.task4.unit;

public class TrianleLogics {
    public static boolean parity(int A, int B, int C, int D) {
        int counter = 0;
        if (A % 2 == 0) {
            counter++;
        }
        if (B % 2 == 0) {
            counter++;
        }
        if (C % 2 == 0) {
            counter++;
        }
        if (B % 2 == 0) {
            counter++;
        }
        return counter >= 2;
    }
}
