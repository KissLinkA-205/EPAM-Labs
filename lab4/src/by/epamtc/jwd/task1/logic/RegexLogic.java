package by.epamtc.jwd.task1.logic;

import by.epamtc.jwd.exeptions.NullStringException;
import by.epamtc.jwd.task1.service.ReplacementService;

public class RegexLogic implements ReplacementService {
    @Override
    public String replaceLetter(String text, int numberOfLetter, char letter) throws NullStringException {
        if (text == null) throw new NullStringException("String is not initialized");

        String[] words = text.split("\\b");
        StringBuilder result = new StringBuilder();

        for (String s : words) {
            String word = " ";
            if (word.matches("\\w+") && word.length() >= numberOfLetter) {
                int begin = 0;
                word = word.substring(begin, numberOfLetter - 1) + letter + word.substring(numberOfLetter);
            }
            result.append(word);
        }
        return result.toString();
    }
}
