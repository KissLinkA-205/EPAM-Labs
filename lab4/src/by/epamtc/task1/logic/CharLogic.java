package by.epamtc.task1.logic;

import by.epamtc.exeptions.NullStringException;
import by.epamtc.task1.service.ReplacementService;
import by.epamtc.util.CharUtil;

public class CharLogic implements ReplacementService {
    @Override
    public String replaceLetter(String text, int numberOfLetter, char letter) throws NullStringException {
        if (text == null) throw new NullStringException("String is not initialized");

        char[] textByChar = text.toCharArray();

        int i = 0;
        while (i < textByChar.length) {
            int wordLength = 0;
            for (int j = i; j < textByChar.length; j++) {
                if (CharUtil.isPunctuationMark(textByChar[j]) || j == textByChar.length - 1) {
                    i++;
                    break;
                }
                wordLength++;
            }
            if (wordLength >= numberOfLetter) {
                textByChar[i + numberOfLetter - 2] = letter;
            }
            i += wordLength;
        }
        return new String(textByChar);
    }
}
