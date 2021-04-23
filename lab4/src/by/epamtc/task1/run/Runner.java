package by.epamtc.task1.run;

import by.epamtc.exeptions.EmptyStringException;
import by.epamtc.scanner.TextDataScanner;
import by.epamtc.task1.logic.ReplacementLogics;

//todo В каждом слове k-ю букву заменить заданным символом. Если k больше длины слова,
//todo корректировку не выполнять.

public class Runner {
    public static void main(String[] args) throws EmptyStringException {
        System.out.println("Enter text:");
        String text = TextDataScanner.readFromConsole();
        System.out.println(text);

        System.out.println("Received text:");
        ReplacementLogics replaceLetters = new ReplacementLogics();
        text = replaceLetters.replaceLetterUsingString(text, 2, '5');
        System.out.println(text);
    }
}
