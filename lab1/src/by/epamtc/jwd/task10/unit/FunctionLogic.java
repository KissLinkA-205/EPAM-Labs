package by.epamtc.jwd.task10.unit;

public class FunctionLogic {
    public void calculateFunction(double a, double b, double h) {
        double x = a, result;
        while (x <= b) {
            result = calculateTangent(x);
            by.epamtc.jwd.task10.run.Runner.printFunction(x, result);
            x = addStep(x, h);
        }
    }

    public double calculateTangent(double x) {
        return java.lang.Math.tan(x);
    }

    public double addStep(double x, double h) {
        return x + h;
    }
}
