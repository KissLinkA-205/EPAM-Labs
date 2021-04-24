package by.epamtc.task3.logic;

import by.epamtc.exeptions.NullStringException;
import by.epamtc.task3.service.ReplacementService;

public class RegexLogic implements ReplacementService {
    @Override
    public String replaceWords(String text, int length, String substring) throws NullStringException {
        if (text == null) throw new NullStringException("String is not initialized");

        String[] words = text.split("\\b");
        StringBuilder result = new StringBuilder();
        String pattern = "\\w{" + length + "}";

        for (String s : words) {
            String word = s;
            if (word.matches(pattern)) {
                word = substring;
            }
            result.append(word);
        }
        return result.toString();
    }
}
