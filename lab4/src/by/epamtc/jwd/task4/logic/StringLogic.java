package by.epamtc.jwd.task4.logic;

import by.epamtc.jwd.exeptions.NullStringException;
import by.epamtc.jwd.task4.service.DeleteService;
import by.epamtc.jwd.util.CharUtil;

public class StringLogic implements DeleteService {
    @Override
    public String deleteNonLetters(String text) throws NullStringException {
        if (text == null) throw new NullStringException("String is not initialized");

        int i = 0;
        while (i < text.length()) {
            boolean isLetter = CharUtil.isLetter(text.charAt(i));

            if (!isLetter && text.charAt(i) != ' ') {
                int begin = 0;
                String workingText = text.substring(begin, i);
                if (i + 1 < text.length()) {
                    workingText += text.substring(i + 1);
                }
                text = workingText;
                i--;
            }
            i++;
        }
        return text;
    }
}
