package by.epamtc.task2.logic;

import by.epamtc.exeptions.EmptyArrayException;
import by.epamtc.task2.service.SortJaggedArray;

public class MinElement implements SortJaggedArray {
    SortJaggedArrayLogic sort = new SortJaggedArrayLogic();

    @Override
    public void bubbleSort(int[][] jaggedArray, boolean increasing) throws EmptyArrayException {
        if (jaggedArray == null) throw new EmptyArrayException("Array is not initialized");

        int replaceableValue, replacementValue;
        for (int i = 0; i < jaggedArray.length - 1; i++) {
            for (int j = 0; j < jaggedArray.length - 1; j++) {
                replaceableValue = findMinValue(jaggedArray[j]);
                replacementValue = findMinValue(jaggedArray[j + 1]);
                if (sort.isChange(replaceableValue, replacementValue, increasing)) {
                    sort.changeValues(jaggedArray, j);
                }
            }
        }
    }

    public int findMinValue(int[] line) throws EmptyArrayException {
        if (line == null) throw new EmptyArrayException("Array is not initialized");

        int minValue = line[0];
        for (int i = 1; i < line.length; i++) {
            if (line[i] < minValue) minValue = line[i];
        }
        return minValue;
    }
}
