package by.epamtc.task2.service;

import by.epamtc.exeptions.EmptyArrayException;

public interface SortJaggedArray {
    void bubbleSort(int[][] jaggedArray, boolean increasing) throws EmptyArrayException;
}