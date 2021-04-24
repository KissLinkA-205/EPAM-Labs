package by.epamtc.task3.logic;

import by.epamtc.exeptions.NullStringException;
import by.epamtc.task3.service.ReplacementService;
import by.epamtc.util.CharArrayUtil;
import by.epamtc.util.CharUtil;

public class CharLogic implements ReplacementService {
    @Override
    public String replaceWords(String text, int length, String substring) throws NullStringException {
        if (text == null) throw new NullStringException("String is not initialized");

        char[] textByChar = text.toCharArray();
        char[] substringByChars = substring.toCharArray();

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
            if (wordLength == length) {
                int begin = 0;
                int end = i - 2;
                char[] leftSubstring = CharArrayUtil.subarray(textByChar, begin, end);
                begin = i - 1 + length;
                end = textByChar.length - 1;
                char[] rightSubstring = CharArrayUtil.subarray(textByChar, begin, end);
                textByChar = CharArrayUtil.concatenate(leftSubstring, substringByChars);
                textByChar = CharArrayUtil.concatenate(textByChar, rightSubstring);
            }
            i += wordLength;
        }

        return new String(textByChar);
    }
}
