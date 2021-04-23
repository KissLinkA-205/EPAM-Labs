package by.epamtc.task2.run;

import by.epamtc.exeptions.EmptyStringException;
import by.epamtc.scanner.TextDataScanner;
import by.epamtc.task2.logic.CorrectionLogics;

//todo В тексте после буквы Р, если она не последняя в слове, ошибочно напечатана буква А
//todo вместо О. Внести исправления в текст.

public class Runner {
    public static void main(String[] args) throws EmptyStringException {
        System.out.println("Enter text:");
        String text = TextDataScanner.readFromConsole();
        System.out.println(text);

        System.out.println("Corrected text:");
        CorrectionLogics correctLetters = new CorrectionLogics();
        text = correctLetters.correctLetterUsingChars(text);
        System.out.println(text);
    }
}

