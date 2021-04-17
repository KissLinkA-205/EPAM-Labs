package by.epamtc.task1.run;

import by.epamtc.exeptions.EmptyArrayException;
import by.epamtc.task1.entity.IntegerArray;
import by.epamtc.task1.logic.FindingArrayElement;
import by.epamtc.task1.logic.FindingSpecialArrayNumbers;
import by.epamtc.task1.logic.SortArray;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) throws EmptyArrayException {
        int[] mas = {0, -3, -2, 1, 7, 3, 2, -5, -4, 8, 9, 6, 10, 4, -1, 5, 321};
        IntegerArray array = new IntegerArray(mas);
        FindingSpecialArrayNumbers specialArrayNumbers = new FindingSpecialArrayNumbers();
        FindingArrayElement arrayElement = new FindingArrayElement();
        SortArray sort = new SortArray();

        System.out.println("Исходный массив:");
        System.out.println(array.toString());

        System.out.println("Отсортированный массив:");
        sort.bubbleSort(array);
        System.out.println(array.toString());

        System.out.println("Число 0 стоит на " + arrayElement.binarySearch(array, 0) + " позиции");
        System.out.println("Максимальное значение массива: " + arrayElement.findMaxValue(array));
        System.out.println("Минимальное значение массива: " + arrayElement.findMinValue(array));

        System.out.println("Все простые числа в массиве:");
        int[] resultArray = specialArrayNumbers.findPrimeNumbers(array);
        System.out.println(Arrays.toString(resultArray));

        System.out.println("Все числа Фибонначчи в массиве:");
        resultArray = specialArrayNumbers.findFibonacciNumbers(array);
        System.out.println(Arrays.toString(resultArray));

        System.out.println("Все трехзначные числа, в которых нет одинаковых цифр:");
        resultArray = specialArrayNumbers.findThreeDigitNumberWithNoSameDigit(array);
        System.out.println(Arrays.toString(resultArray));
    }
}
