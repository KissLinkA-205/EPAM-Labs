package by.epamtc.jwd.task1.logic;

public class IntegerLogic {
    public boolean isPrime(int number) {
        boolean result = false;

        if (number > 1) {
            result = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public boolean isFibonacci(int number) {
        int tmp = 5 * number * number;
        return (Math.sqrt(tmp + 4) % 1 == 0 || Math.sqrt(tmp - 4) % 1 == 0) && number >= 0;
    }

    public boolean isThreeDigitNumber(int number) {
        int moduleNumber = Math.abs(number);
        return moduleNumber > 99 && moduleNumber < 1000;
    }

    public boolean isHaveSameDigit(int number) {
        boolean isHave = false;
        boolean[] digits = new boolean[10];
        int iteration = 0;
        while (iteration < 11 && number != 0) {
            int digit = number % 10;
            if (digits[digit]) {
                isHave = true;
                break;
            }
            digits[digit] = true;
            number /= 10;
            iteration++;
        }
        if (iteration > 10) isHave = true;
        return isHave;
    }
}
