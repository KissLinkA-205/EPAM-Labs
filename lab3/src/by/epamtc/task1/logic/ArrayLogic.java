package by.epamtc.task1.logic;

import by.epamtc.exeptions.EmptyArrayException;
import by.epamtc.exeptions.WrongDataFileException;
import by.epamtc.scanner.DataScanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class ArrayLogic {
    public static int[] cutArray(int[] array, int length) throws EmptyArrayException {
        if (array == null) throw new EmptyArrayException("Array is not initialized");
        if (length > array.length) length = array.length;
        int[] resultArray = new int[length];
        if (length >= 0) System.arraycopy(array, 0, resultArray, 0, length);
        return resultArray;
    }

    public static int[] fillArrayWithRandom(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

        return array;
    }

    public static int[] fillArrayFromFile(String fileName) throws FileNotFoundException, WrongDataFileException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        int length = scanner.nextInt();
        if (length <= 0) return null;

        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            if (!scanner.hasNextInt()) throw new WrongDataFileException("Corrupted data");
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static int[] fillArrayFromConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = DataScanner.enterIntFromConsole();
        }

        return array;
    }
}
