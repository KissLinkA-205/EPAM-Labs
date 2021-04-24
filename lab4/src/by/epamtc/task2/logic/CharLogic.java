package by.epamtc.task2.logic;

import by.epamtc.exeptions.NullStringException;
import by.epamtc.task2.service.CorrectionService;
import by.epamtc.util.CharUtil;

public class CharLogic implements CorrectionService {
    @Override
    public String correctLetter(String text) throws NullStringException {
        if (text == null) throw new NullStringException("String is not initialized");

        char[] textByChar = text.toCharArray();
        for (int i = 0; i < textByChar.length - 3; i++) {

            if (textByChar[i] == 'P' && textByChar[i + 1] == 'A'
                    && !CharUtil.isPunctuationMark(textByChar[i + 2]) && i + 2 != text.length() - 1) {
                textByChar[i + 1] = 'O';
            }
        }

        return new String(textByChar);
    }
}
