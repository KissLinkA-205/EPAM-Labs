package by.epamtc.task4.run;

import by.epamtc.exeptions.NullStringException;
import by.epamtc.scanner.TextDataScanner;
import by.epamtc.task4.logic.StringLogic;
import by.epamtc.task4.service.DeleteService;

//todo Из небольшого текста удалить все символы, кроме пробелов, не являющиеся буквами.

public class Runner {
    public static void main(String[] args) throws NullStringException {
        System.out.println("Enter text:");
        String text = TextDataScanner.readFromConsole();
        System.out.println(text);

        System.out.println("Received text:");
        DeleteService deleteNonLettersUsingString = new StringLogic();
        text = deleteNonLettersUsingString.deleteNonLetters(text);
        System.out.println(text);
    }
}
