package by.epamtc.task5.logic;

import by.epamtc.exeptions.NullStringException;
import by.epamtc.task5.service.DeleteService;
import by.epamtc.util.CharArrayUtil;
import by.epamtc.util.CharUtil;

public class CharLogic implements DeleteService {
    @Override
    public String deleteConsonantWords(String text, int length) throws NullStringException {
        if (text == null) throw new NullStringException("String is not initialized");

        char[] textByChar = text.toCharArray();

        int i = 0;
        while (i < textByChar.length) {
            int wordLength = 0;
            for (int j = i; j < textByChar.length; j++) {
                char currentLetter = textByChar[j];
                if (CharUtil.isPunctuationMark(currentLetter)) {
                    i++;
                    break;
                }
                if (j == textByChar.length - 1) i++;
                wordLength++;
            }
            if (wordLength == length && CharUtil.isConsonant(textByChar[i - 1])) {
                int begin = 0;
                int end = i - 2;
                char[] leftSubstring = CharArrayUtil.subarray(textByChar, begin, end);
                begin = i - 1 + length;
                end = textByChar.length - 1;
                char[] rightSubstring = CharArrayUtil.subarray(textByChar, begin, end);
                textByChar = CharArrayUtil.concatenate(leftSubstring, rightSubstring);
            } else i += wordLength;
        }

        return new String(textByChar);
    }
}
