package by.epamtc.jwd.task1.logic;

import by.epamtc.jwd.exeptions.EmptyArrayException;
import by.epamtc.jwd.task1.entity.IntegerArray;

public class FindingArrayElement {
    public int binarySearch(IntegerArray array, int elementToSearch) throws EmptyArrayException {
        int[] workingArray = array.getValues();
        if (workingArray == null) throw new EmptyArrayException("Array is not initialized");
        int firstIndex = 0;
        int lastIndex = workingArray.length - 1;

        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (workingArray[middleIndex] == elementToSearch) {
                return middleIndex;
            } else if (workingArray[middleIndex] < elementToSearch)
                firstIndex = middleIndex + 1;
            else if (workingArray[middleIndex] > elementToSearch)
                lastIndex = middleIndex - 1;
        }
        return -1;
    }

    public int findMinValue(IntegerArray array) throws EmptyArrayException {
        int[] workingArray = array.getValues();
        if (workingArray == null) throw new EmptyArrayException("Array is not initialized");
        int minValue = workingArray[0];

        for (int i = 1; i < array.getValues().length; i++) {
            if (workingArray[i] < minValue) {
                minValue = workingArray[i];
            }
        }

        return minValue;
    }

    public int findMaxValue(IntegerArray array) throws EmptyArrayException {
        int[] workingArray = array.getValues();
        if (workingArray == null) throw new EmptyArrayException("Array is not initialized");
        int maxValue = workingArray[0];

        for (int i = 1; i < array.getValues().length; i++) {
            if (workingArray[i] > maxValue) {
                maxValue = workingArray[i];
            }
        }

        return maxValue;
    }
}
