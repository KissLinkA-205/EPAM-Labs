package by.epamtc.jwd.task2.run;

import by.epamtc.jwd.exeptions.NullStringException;
import by.epamtc.jwd.scanner.TextDataScanner;
import by.epamtc.jwd.task2.logic.CharLogic;
import by.epamtc.jwd.task2.service.CorrectionService;

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

