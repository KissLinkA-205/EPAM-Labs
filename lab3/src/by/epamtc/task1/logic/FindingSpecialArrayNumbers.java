package by.epamtc.task1.logic;

import by.epamtc.exeptions.EmptyArrayException;
import by.epamtc.task1.entity.IntegerArray;

public class FindingSpecialArrayNumbers {
    public static int[] findPrimeNumbers(IntegerArray array) throws EmptyArrayException {
        int[] workingArray = array.getValues();
        if (workingArray == null) throw new EmptyArrayException("Array is not initialized");
        int[] primeArray = new int[workingArray.length];
        int length = 0;

        for (int number : workingArray) {
            if (IntegerLogic.isPrime(number)) primeArray[length++] = number;
        }
        return cutArray(primeArray, length);
    }

    public static int[] findFibonacciNumbers(IntegerArray array) throws EmptyArrayException {
        int[] workingArray = array.getValues();
        if (workingArray == null) throw new EmptyArrayException("Array is not initialized");
        int[] fibonacciArray = new int[workingArray.length];
        int length = 0;

        for (int number : workingArray) {
            if (IntegerLogic.isFibonacci(number))
                fibonacciArray[length++] = number;
        }
        return cutArray(fibonacciArray, length);
    }

    public static int[] findThreeDigitNumberWithNoSameDigit(IntegerArray array) throws EmptyArrayException {
        int[] workingArray = array.getValues();
        if (workingArray == null) throw new EmptyArrayException("Array is not initialized");
        int[] numbers = new int[workingArray.length];
        int length = 0;
        for (int number : workingArray) {
            if (IntegerLogic.isThreeDigitNumber(number) && !IntegerLogic.isHaveSameDigit(number))
                numbers[length++] = number;
        }
        return cutArray(numbers, length);
    }

    public static int[] cutArray(int[] array, int length) throws EmptyArrayException {
        if (array == null) throw new EmptyArrayException("Array is not initialized");
        if (length > array.length) length = array.length;
        int[] resultArray = new int[length];
        if (length >= 0) System.arraycopy(array, 0, resultArray, 0, length);
        return resultArray;
    }
}
