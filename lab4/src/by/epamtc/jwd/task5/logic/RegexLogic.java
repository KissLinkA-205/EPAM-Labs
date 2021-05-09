package by.epamtc.jwd.task5.logic;

import by.epamtc.jwd.exeptions.NullStringException;
import by.epamtc.jwd.task5.service.DeleteService;

public class RegexLogic implements DeleteService {
    @Override
    public String deleteConsonantWords(String text, int length) throws NullStringException {
        if (text == null) throw new NullStringException("String is not initialized");

        String[] words = text.split("\\b");
        StringBuilder result = new StringBuilder();
        String pattern = "[B-DF-HJ-NP-TV-Zb-df-hj-np-tv-z]\\w{" + (length - 1) + "}";

        for (String word : words) {
            if (!word.matches(pattern)) {
                result.append(word);
            }
        }

        return result.toString();
    }
}
