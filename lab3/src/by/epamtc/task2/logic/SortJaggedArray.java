package by.epamtc.task2.logic;

import by.epamtc.exeptions.EmptyArrayException;
import by.epamtc.task2.property.SelectedSort;

public class SortJaggedArray {
    public static void bubbleSort(int[][] jaggedArray, SelectedSort sortChoice, boolean increasing) throws EmptyArrayException {
        if (jaggedArray == null) throw new EmptyArrayException("Array is not initialized");

        int replaceableValue, replacementValue;
        for (int i = 0; i < jaggedArray.length - 1; i++) {
            for (int j = 0; j < jaggedArray.length - 1; j++) {
                switch (sortChoice) {
                    case SORT_BY_SUM_OF_ELEMENTS:
                        replaceableValue = JaggedArrayLogic.sumOfLine(jaggedArray, j);
                        replacementValue = JaggedArrayLogic.sumOfLine(jaggedArray, j + 1);
                        break;
                    case SORT_BY_MAX_ELEMENT:
                        replaceableValue = JaggedArrayLogic.findMaxValue(jaggedArray[j]);
                        replacementValue = JaggedArrayLogic.findMaxValue(jaggedArray[j + 1]);
                        break;
                    case SORT_BY_MIN_ELEMENT:
                        replaceableValue = JaggedArrayLogic.findMinValue(jaggedArray[j]);
                        replacementValue = JaggedArrayLogic.findMinValue(jaggedArray[j + 1]);
                        break;
                    default:
                        return;
                }
                if (isChange(replaceableValue, replacementValue, increasing)) changeValues(jaggedArray, j);
            }
        }
    }

    public static boolean isChange(int value1, int value2, boolean increasing) {
        boolean result = false;
        if (value1 > value2 && increasing || value1 < value2 && !increasing) result = true;
        return result;
    }

    public static void changeValues(int[][] jaggedArray, int index) throws EmptyArrayException {
        if (jaggedArray == null) throw new EmptyArrayException("Array is not initialized");
        int[] temp;
        temp = jaggedArray[index];
        jaggedArray[index] = jaggedArray[index + 1];
        jaggedArray[index + 1] = temp;
    }

}
