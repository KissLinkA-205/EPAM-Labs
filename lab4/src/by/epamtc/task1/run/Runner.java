package by.epamtc.task1.run;

import by.epamtc.exeptions.NullStringException;
import by.epamtc.scanner.TextDataScanner;
import by.epamtc.task1.logic.StringLogic;
import by.epamtc.task1.service.ReplacementService;

//todo В каждом слове k-ю букву заменить заданным символом. Если k больше длины слова,
//todo корректировку не выполнять.

public class Runner {
    public static void main(String[] args) throws NullStringException {
        System.out.println("Enter text:");
        String text = TextDataScanner.readFromConsole();
        System.out.println(text);

        System.out.println("Received text:");
        int numberOfLetter = 2;
        char letter = '5';
        ReplacementService replaceLetterUsingString = new StringLogic();
        text = replaceLetterUsingString.replaceLetter(text, numberOfLetter, letter);
        System.out.println(text);
    }
}
