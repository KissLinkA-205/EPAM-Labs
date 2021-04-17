package by.epamtc.task2.run;

import by.epamtc.exeptions.EmptyArrayException;
import by.epamtc.task2.property.SelectedSort;
import by.epamtc.task2.logic.SortJaggedArray;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) throws EmptyArrayException {
        int[][] jaggedArray = {{0, -1, 3}, {99, 325, -32, -4, 6}, {-54, -12, 12, 7}, {1, 2}};

        System.out.println("Исходный массив: ");
        System.out.println(Arrays.deepToString(jaggedArray));

        System.out.println("Массив, отсортированный по сумме строк по возрастанию: ");
        SortJaggedArray.bubbleSort(jaggedArray, SelectedSort.SORT_BY_SUM_OF_ELEMENTS, true);
        System.out.println(Arrays.deepToString(jaggedArray));

        System.out.println("Массив, отсортированный по максимальному значению строки по убыванию: ");
        SortJaggedArray.bubbleSort(jaggedArray, SelectedSort.SORT_BY_MAX_ELEMENT, false);
        System.out.println(Arrays.deepToString(jaggedArray));

        System.out.println("Массив, отсортированный по минимальному значению строки по возрастанию: ");
        SortJaggedArray.bubbleSort(jaggedArray, SelectedSort.SORT_BY_MIN_ELEMENT, true);
        System.out.println(Arrays.deepToString(jaggedArray));
    }
}
