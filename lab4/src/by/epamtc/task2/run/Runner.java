package by.epamtc.task2.run;

import by.epamtc.exeptions.NullStringException;
import by.epamtc.scanner.TextDataScanner;
import by.epamtc.task2.logic.CharLogic;
import by.epamtc.task2.service.CorrectionService;

//todo В тексте после буквы Р, если она не последняя в слове, ошибочно напечатана буква А
//todo вместо О. Внести исправления в текст.

public class Runner {
    public static void main(String[] args) throws NullStringException {
        System.out.println("Enter text:");
        String text = TextDataScanner.readFromConsole();
        System.out.println(text);

        System.out.println("Corrected text:");
        CorrectionService correctLetterUsingChars = new CharLogic();
        text = correctLetterUsingChars.correctLetter(text);
        System.out.println(text);
    }
}

