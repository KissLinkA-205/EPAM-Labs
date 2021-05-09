package by.epamtc.jwd.task2.logic;

import by.epamtc.jwd.exeptions.EmptyArrayException;
import by.epamtc.jwd.task2.service.SortJaggedArray;

public class SumOfElements implements SortJaggedArray {
    SortJaggedArrayLogic sort = new SortJaggedArrayLogic();

    @Override
    public void bubbleSort(int[][] jaggedArray, boolean increasing) throws EmptyArrayException {
        if (jaggedArray == null) throw new EmptyArrayException("Array is not initialized");

        int replaceableValue, replacementValue;
        for (int i = 0; i < jaggedArray.length - 1; i++) {
            for (int j = 0; j < jaggedArray.length - 1; j++) {
                replaceableValue = sumOfLine(jaggedArray, j);
                replacementValue = sumOfLine(jaggedArray, j + 1);
                if (sort.isChange(replaceableValue, replacementValue, increasing)) {
                    sort.changeValues(jaggedArray, j);
                }
            }
        }
    }

    public int sumOfLine(int[][] jaggedArray, int line) throws EmptyArrayException {
        if (jaggedArray == null) throw new EmptyArrayException("Array is not initialized");

        int sum = 0;
        for (int i = 0; i < jaggedArray[line].length; i++) {
            sum += jaggedArray[line][i];
        }
        return sum;
    }
}
