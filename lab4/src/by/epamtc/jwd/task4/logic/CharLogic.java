package by.epamtc.jwd.task4.logic;

import by.epamtc.jwd.exeptions.NullStringException;
import by.epamtc.jwd.task4.service.DeleteService;
import by.epamtc.jwd.util.CharArrayUtil;
import by.epamtc.jwd.util.CharUtil;

public class CharLogic implements DeleteService {
    @Override
    public String deleteNonLetters(String text) throws NullStringException {
        if (text == null) throw new NullStringException("String is not initialized");

        char[] textByChar = text.toCharArray();
        int i = 0;
        while (i < textByChar.length) {
            boolean isLetter = CharUtil.isLetter(textByChar[i]);

            if (!isLetter && textByChar[i] != ' ') {
                int begin = 0;
                int end = i - 1;
                char[] leftSubstring = CharArrayUtil.subarray(textByChar, begin, end);
                char[] rightSubstring = {};
                if (i + 1 < textByChar.length) {
                    begin = i + 1;
                    end = textByChar.length - 1;
                    rightSubstring = CharArrayUtil.subarray(textByChar, begin, end);
                }
                textByChar = CharArrayUtil.concatenate(leftSubstring, rightSubstring);
                i--;
            }
            i++;
        }
        return new String(textByChar);
    }
}
