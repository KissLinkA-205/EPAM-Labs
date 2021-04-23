package by.epamtc.task3.run;

import by.epamtc.exeptions.EmptyStringException;
import by.epamtc.scanner.TextDataScanner;
import by.epamtc.task3.logic.ReplacementLogics;

//todo В тексте слова заданной длины заменить указанной подстрокой, длина которой может
//todo не совпадать с длиной слова.

public class Runner {
    public static void main(String[] args) throws EmptyStringException {
        System.out.println("Enter text:");
        String text = TextDataScanner.readFromConsole();
        System.out.println(text);

        System.out.println("Received text:");
        ReplacementLogics replaceWords = new ReplacementLogics();
        int length = 3;
        String substring = "Hello world!";
        text = replaceWords.replaceWordsUsingRegex(text, length, substring);
        System.out.println(text);
    }
}
