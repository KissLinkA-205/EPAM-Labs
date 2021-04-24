package by.epamtc.task2.logic;

import by.epamtc.exeptions.NullStringException;
import by.epamtc.task2.service.CorrectionService;
import by.epamtc.util.CharUtil;

public class StringLogic implements CorrectionService {
    @Override
    public String correctLetter(String text) throws NullStringException {
        if (text == null) throw new NullStringException("String is not initialized");

        for (int i = 0; i < text.length() - 3; i++) {

            if (text.charAt(i) == 'P' && text.charAt(i + 1) == 'A'
                    && !CharUtil.isPunctuationMark(text.charAt(i + 2)) && i + 2 != text.length() - 1) {
                int begin = 0;
                text = text.substring(begin, i + 1) + 'O' + text.substring(i + 2);
            }
        }

        return text;
    }
}
