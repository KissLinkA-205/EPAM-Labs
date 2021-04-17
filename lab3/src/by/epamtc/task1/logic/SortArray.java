package by.epamtc.task1.logic;

import by.epamtc.exeptions.EmptyArrayException;
import by.epamtc.task1.entity.IntegerArray;

public class SortArray {

    public void bubbleSort(IntegerArray array) throws EmptyArrayException {
        int[] sortedArray = array.getValues();
        if (sortedArray == null) throw new EmptyArrayException("Array is not initialized");

        int tempValue;
        for (int i = 0; i < array.getValues().length - 1; i++) {
            for (int j = 0; j < array.getValues().length - 1; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    tempValue = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = tempValue;
                }
            }
        }
        array.setValues(sortedArray);
    }

    public void insertSort(IntegerArray array) throws EmptyArrayException {
        int[] sortedArray = array.getValues();
        if (sortedArray == null) throw new EmptyArrayException("Array is not initialized");

        for (int i = 1; i < array.getValues().length; i++) {
            int j = i - 1;
            int currentValue = sortedArray[i];
            for (; j >= 0; j--) {
                if (currentValue < sortedArray[j]) {
                    sortedArray[j + 1] = sortedArray[j];
                } else break;
            }
            sortedArray[j + 1] = currentValue;
        }
        array.setValues(sortedArray);
    }

    public void selectSort(IntegerArray array) throws EmptyArrayException {
        int[] sortedArray = array.getValues();
        if (sortedArray == null) throw new EmptyArrayException("Array is not initialized");

        int minValue = 0;
        int minValueIndex = 0;
        for (int i = 0; i < array.getValues().length; i++) {
            minValue = sortedArray[i];
            minValueIndex = i;
            for (int j = i + 1; j < array.getValues().length; j++) {
                if (sortedArray[j] < minValue) {
                    minValue = sortedArray[j];
                    minValueIndex = j;
                }
            }
            sortedArray[minValueIndex] = sortedArray[i];
            sortedArray[i] = minValue;
        }
        array.setValues(sortedArray);
    }
}
