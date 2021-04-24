package by.epamtc.task1.logic;

import by.epamtc.exeptions.NullStringException;
import by.epamtc.task1.service.ReplacementService;
import by.epamtc.util.CharUtil;

public class StringLogic implements ReplacementService {
    @Override
    public String replaceLetter(String text, int numberOfLetter, char letter) throws NullStringException {
        if (text == null) throw new NullStringException("String is not initialized");

        int i = 0;
        while (i < text.length()) {
            int wordLength = 0;
            for (int j = i; j < text.length(); j++) {
                char currentLetter = text.charAt(j);
                if (CharUtil.isPunctuationMark(currentLetter) || j == text.length() - 1) {
                    i++;
                    break;
                }
                wordLength++;
            }
            if (wordLength >= numberOfLetter) {
                int begin = 0;
                text = text.substring(begin, i + numberOfLetter - 2) + letter + text.substring(i + numberOfLetter - 1);
            }
            i += wordLength;
        }
        return text;
    }
}

