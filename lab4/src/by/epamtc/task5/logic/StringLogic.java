package by.epamtc.task5.logic;

import by.epamtc.exeptions.NullStringException;
import by.epamtc.task5.service.DeleteService;
import by.epamtc.util.CharUtil;

public class StringLogic implements DeleteService {
    @Override
    public String deleteConsonantWords(String text, int length) throws NullStringException {
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
            if (wordLength == length && CharUtil.isConsonant(text.charAt(i - 1))) {
                int begin = 0;
                int end = i - 1;
                String left = text.substring(begin, end);
                begin = i - 1 + length;
                String right = text.substring(begin);
                text = left + right;

            } else i += wordLength;
        }

        return text;
    }
}
