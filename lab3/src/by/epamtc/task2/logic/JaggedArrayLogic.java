package by.epamtc.task2.logic;

import by.epamtc.exeptions.EmptyArrayException;

public class JaggedArrayLogic {
    public static int sumOfLine(int[][] jaggedArray, int line) throws EmptyArrayException {
        if (jaggedArray == null) throw new EmptyArrayException("Array is not initialized");

        int sum = 0;
        for (int i = 0; i < jaggedArray[line].length; i++) {
            sum += jaggedArray[line][i];
        }
        return sum;
    }

    public static int findMinValue(int[] line) throws EmptyArrayException {
        if (line == null) throw new EmptyArrayException("Array is not initialized");

        int minValue = line[0];
        for (int i = 1; i < line.length; i++) {
            if (line[i] < minValue) minValue = line[i];
        }
        return minValue;
    }

    public static int findMaxValue(int[] line) throws EmptyArrayException {
        if (line == null) throw new EmptyArrayException("Array is not initialized");

        int maxValue = line[0];
        for (int i = 1; i < line.length; i++) {
            if (line[i] > maxValue) maxValue = line[i];
        }
        return maxValue;
    }
}
