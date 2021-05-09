package by.epamtc.jwd.task2.logic;

import by.epamtc.jwd.exeptions.EmptyArrayException;
import by.epamtc.jwd.task2.service.SortJaggedArray;

public class MaxElement implements SortJaggedArray {
    SortJaggedArrayLogic sort = new SortJaggedArrayLogic();

    @Override
    public void bubbleSort(int[][] jaggedArray, boolean increasing) throws EmptyArrayException {
        if (jaggedArray == null) throw new EmptyArrayException("Array is not initialized");

        int replaceableValue, replacementValue;
        for (int i = 0; i < jaggedArray.length - 1; i++) {
            for (int j = 0; j < jaggedArray.length - 1; j++) {
                replaceableValue = findMaxValue(jaggedArray[j]);
                replacementValue = findMaxValue(jaggedArray[j + 1]);
                if (sort.isChange(replaceableValue, replacementValue, increasing)) {
                    sort.changeValues(jaggedArray, j);
                }
            }
        }
    }

    public int findMaxValue(int[] line) throws EmptyArrayException {
        if (line == null) throw new EmptyArrayException("Array is not initialized");

        int maxValue = line[0];
        for (int i = 1; i < line.length; i++) {
            if (line[i] > maxValue) maxValue = line[i];
        }
        return maxValue;
    }
}
