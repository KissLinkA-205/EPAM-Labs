package by.epamtc.jwd.task3.logic;

import by.epamtc.jwd.exeptions.NullStringException;
import by.epamtc.jwd.task3.service.ReplacementService;
import by.epamtc.jwd.util.CharUtil;

public class StringLogic implements ReplacementService {
    @Override
    public String replaceWords(String text, int length, String substring) throws NullStringException {
        if (text == null) throw new NullStringException("String is not initialized");

        int i = 0;
        while (i < text.length()) {
            int wordLength = 0;
            for (int j = i; j < text.length(); j++) {
                char currentLetter = text.charAt(j);
                if (CharUtil.isPunctuationMark(currentLetter)) {
                    i++;
                    break;
                }
                if (j == text.length() - 1) i++;
                wordLength++;
            }
            if (wordLength == length) {
                int begin = 0;
                String left = text.substring(begin, i - 1);
                String right = text.substring(i - 1 + length);
                text = left + substring + right;
            }
            i += wordLength;
        }

        return text;
    }
}
