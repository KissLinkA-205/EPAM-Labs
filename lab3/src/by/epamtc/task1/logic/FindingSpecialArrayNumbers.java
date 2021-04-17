package by.epamtc.task1.logic;

import by.epamtc.exeptions.EmptyArrayException;
import by.epamtc.task1.entity.IntegerArray;

public class FindingSpecialArrayNumbers {
    IntegerLogic integer = new IntegerLogic();
    public int[] findPrimeNumbers(IntegerArray array) throws EmptyArrayException {
        int[] workingArray = array.getValues();
        if (workingArray == null) throw new EmptyArrayException("Array is not initialized");
        int[] primeArray = new int[workingArray.length];
        int length = 0;

        for (int number : workingArray) {
            if (integer.isPrime(number)) primeArray[length++] = number;
        }
        return cutArray(primeArray, length);
    }

    public int[] findFibonacciNumbers(IntegerArray array) throws EmptyArrayException {
        int[] workingArray = array.getValues();
        if (workingArray == null) throw new EmptyArrayException("Array is not initialized");
        int[] fibonacciArray = new int[workingArray.length];
        int length = 0;

        for (int number : workingArray) {
            if (integer.isFibonacci(number))
                fibonacciArray[length++] = number;
        }
        return cutArray(fibonacciArray, length);
    }

    public int[] findThreeDigitNumberWithNoSameDigit(IntegerArray array) throws EmptyArrayException {
        int[] workingArray = array.getValues();
        if (workingArray == null) throw new EmptyArrayException("Array is not initialized");
        int[] numbers = new int[workingArray.length];
        int length = 0;
        for (int number : workingArray) {
            if (integer.isThreeDigitNumber(number) && !integer.isHaveSameDigit(number))
                numbers[length++] = number;
        }
        return cutArray(numbers, length);
    }

    public int[] cutArray(int[] array, int length) throws EmptyArrayException {
        if (array == null) throw new EmptyArrayException("Array is not initialized");
        if (length > array.length) length = array.length;
        int[] resultArray = new int[length];
        if (length >= 0) System.arraycopy(array, 0, resultArray, 0, length);
        return resultArray;
    }
}
