package by.epamtc.task4.run;

import by.epamtc.exeptions.EmptyStringException;
import by.epamtc.scanner.TextDataScanner;
import by.epamtc.task4.logic.DeleteLogics;

//todo Из небольшого текста удалить все символы, кроме пробелов, не являющиеся буквами.

public class Runner {
    public static void main(String[] args) throws EmptyStringException {
        System.out.println("Enter text:");
        String text = TextDataScanner.readFromConsole();
        System.out.println(text);

        System.out.println("Received text:");
        DeleteLogics deleteNonLetters = new DeleteLogics();
        text = deleteNonLetters.deleteNonLettersUsingString(text);
        System.out.println(text);
    }
}
