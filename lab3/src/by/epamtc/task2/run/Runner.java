package by.epamtc.task2.run;

import by.epamtc.exeptions.EmptyArrayException;
import by.epamtc.task2.logic.MaxElement;
import by.epamtc.task2.logic.MinElement;
import by.epamtc.task2.logic.SumOfElements;
import by.epamtc.task2.service.SortJaggedArray;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) throws EmptyArrayException {
        int[][] jaggedArray = {{0, -1, 3}, {99, 325, -32, -4, 6}, {-54, -12, 12, 7}, {1, 2}};
        System.out.println("Исходный массив: ");
        System.out.println(Arrays.deepToString(jaggedArray));

        System.out.println("Массив, отсортированный по сумме строк по возрастанию: ");
        SortJaggedArray sortBySum = new SumOfElements();
        sortBySum.bubbleSort(jaggedArray, true);
        System.out.println(Arrays.deepToString(jaggedArray));

        System.out.println("Массив, отсортированный по максимальному значению строки по убыванию: ");
        SortJaggedArray sortByMaxElement = new MaxElement();
        sortByMaxElement.bubbleSort(jaggedArray, false);
        System.out.println(Arrays.deepToString(jaggedArray));

        System.out.println("Массив, отсортированный по минимальному значению строки по возрастанию: ");
        SortJaggedArray sortByMinElement = new MinElement();
        sortByMinElement.bubbleSort(jaggedArray, true);
        System.out.println(Arrays.deepToString(jaggedArray));
    }
}
