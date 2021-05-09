package by.epamtc.jwd.task8.unit;

public class FunctionLogic {
    public boolean isMoreThanThree(double x) {
        int three = 3;
        return x >= three;
    }

    public double calculateFunctionGreaterThanTree(double x) {
        return -x * x + 3 * x + 9;
    }

    public double calculateFunctionLessThanTree(double x) {
        return (1 / (x * x * x - 6));
    }

    public double defineFunction(double x) {
        double result;
        if(isMoreThanThree(x)) {
            result = calculateFunctionGreaterThanTree(x);
        } else {
            result = calculateFunctionLessThanTree(x);
        }

        return result;
    }
}
