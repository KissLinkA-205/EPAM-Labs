package by.epamtc.jwd.task5.run;

import by.epamtc.jwd.exeptions.NullStringException;
import by.epamtc.jwd.scanner.TextDataScanner;
import by.epamtc.jwd.task5.logic.CharLogic;
import by.epamtc.jwd.task5.service.DeleteService;

//todo Из текста удалить все слова заданной длины, начинающиеся на согласную букву.

public class Runner {
    public static void main(String[] args) throws NullStringException {
        System.out.println("Enter text:");
        String text = TextDataScanner.readFromConsole();
        System.out.println(text);

        System.out.println("Received text:");
        DeleteService deleteConsonantWordsUsingChars = new CharLogic();
        int length = 3;
        text = deleteConsonantWordsUsingChars.deleteConsonantWords(text, length);
        System.out.println(text);
    }
}