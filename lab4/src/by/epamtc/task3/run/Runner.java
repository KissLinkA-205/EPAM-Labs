package by.epamtc.task3.run;

import by.epamtc.exeptions.NullStringException;
import by.epamtc.scanner.TextDataScanner;
import by.epamtc.task3.logic.RegexLogic;
import by.epamtc.task3.service.ReplacementService;

//todo В тексте слова заданной длины заменить указанной подстрокой, длина которой может
//todo не совпадать с длиной слова.

public class Runner {
    public static void main(String[] args) throws NullStringException {
        System.out.println("Enter text:");
        String text = TextDataScanner.readFromConsole();
        System.out.println(text);

        System.out.println("Received text:");
        ReplacementService replaceWordsUsingRegex = new RegexLogic();
        int length = 3;
        String substring = "Hello world!";
        text = replaceWordsUsingRegex.replaceWords(text, length, substring);
        System.out.println(text);
    }
}
