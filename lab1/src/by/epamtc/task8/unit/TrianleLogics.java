package by.epamtc.task8.unit;

public class TrianleLogics {
    public static boolean isMoreThanThree(double x) {
        int three = 3;
        return x >= three;
    }

    public static double calculateFunctionGreaterThanTree(double x) {
        return -x * x + 3 * x + 9;
    }

    public static double calculateFunctionLessThanTree(double x) {
        return (1 / (x * x * x - 6));
    }

    public static double defineFunction(double x) {
        double result;
        if(by.epamtc.task8.unit.TrianleLogics.isMoreThanThree(x)) {
            result = by.epamtc.task8.unit.TrianleLogics.calculateFunctionGreaterThanTree(x);
        } else {
            result = by.epamtc.task8.unit.TrianleLogics.calculateFunctionLessThanTree(x);
        }

        return result;
    }
}
