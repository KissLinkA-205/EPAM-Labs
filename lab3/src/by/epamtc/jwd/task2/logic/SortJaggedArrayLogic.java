package by.epamtc.jwd.task2.logic;

import by.epamtc.jwd.exeptions.EmptyArrayException;

public class SortJaggedArrayLogic {
    boolean isChange(int value1, int value2, boolean increasing) {
        boolean result = false;
        if (value1 > value2 && increasing || value1 < value2 && !increasing) result = true;
        return result;
    }

    void changeValues(int[][] jaggedArray, int index) throws EmptyArrayException {
        if (jaggedArray == null) throw new EmptyArrayException("Array is not initialized");
        int[] temp;
        temp = jaggedArray[index];
        jaggedArray[index] = jaggedArray[index + 1];
        jaggedArray[index + 1] = temp;
    }
}
