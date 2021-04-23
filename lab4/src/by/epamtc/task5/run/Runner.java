package by.epamtc.task5.run;

import by.epamtc.exeptions.EmptyStringException;
import by.epamtc.scanner.TextDataScanner;
import by.epamtc.task5.logic.DeleteLogics;

//todo Из текста удалить все слова заданной длины, начинающиеся на согласную букву.

public class Runner {
    public static void main(String[] args) throws EmptyStringException {
        System.out.println("Enter text:");
        String text = TextDataScanner.readFromConsole();
        System.out.println(text);

        System.out.println("Received text:");
        DeleteLogics deleteConsonantWords = new DeleteLogics();
        text = deleteConsonantWords.deleteConsonantWordsUsingChars(text, 3);
        System.out.println(text);
    }
}