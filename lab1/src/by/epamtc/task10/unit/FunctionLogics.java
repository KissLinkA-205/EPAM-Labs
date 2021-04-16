package by.epamtc.task10.unit;

public class FunctionLogics {
    public static void calculateFunction(double a, double b, double h) {
        double x = a, result;
        while (x <= b) {
            result = FunctionLogics.calculateTangent(x);
            by.epamtc.task10.run.Runner.printFunction(x, result);
            x = FunctionLogics.addStep(x, h);
        }
    }

    public static double calculateTangent(double x) {
        return java.lang.Math.tan(x);
    }

    public static double addStep(double x, double h) {
        return x + h;
    }
}
