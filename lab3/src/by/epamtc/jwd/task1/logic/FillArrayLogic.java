package by.epamtc.jwd.task1.logic;

import by.epamtc.jwd.exeptions.WrongDataFileException;
import by.epamtc.jwd.scanner.DataScanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class FillArrayLogic {
    public int[] fillArrayWithRandom(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

        return array;
    }

    public int[] fillArrayFromFile(String fileName) throws FileNotFoundException, WrongDataFileException {
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

    public int[] fillArrayFromConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = DataScanner.enterIntFromConsole();
        }

        return array;
    }
}
