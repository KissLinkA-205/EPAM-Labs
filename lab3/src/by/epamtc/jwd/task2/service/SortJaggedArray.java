package by.epamtc.jwd.task2.service;

import by.epamtc.jwd.exeptions.EmptyArrayException;

public interface SortJaggedArray {
    void bubbleSort(int[][] jaggedArray, boolean increasing) throws EmptyArrayException;
}