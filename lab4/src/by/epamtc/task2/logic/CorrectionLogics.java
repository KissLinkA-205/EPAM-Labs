package by.epamtc.task2.logic;

import by.epamtc.exeptions.EmptyStringException;
import by.epamtc.util.CharLogics;

public class CorrectionLogics {
    public String correctLetterUsingString(String text) throws EmptyStringException {
        if (text == null) throw new EmptyStringException("String is empty");

        for (int i = 0; i < text.length() - 3; i++) {

            if (text.charAt(i) == 'P' && text.charAt(i + 1) == 'A'
                    && !CharLogics.isPunctuationMark(text.charAt(i + 2)) && i + 2 != text.length() - 1) {
                int begin = 0;
                text = text.substring(begin, i + 1) + 'O' + text.substring(i + 2);
            }
        }

        return text;
    }

    public String correctLetterUsingChars(String text) throws EmptyStringException {
        if (text == null) throw new EmptyStringException("String is empty");

        char[] textByChar = text.toCharArray();
        for (int i = 0; i < textByChar.length - 3; i++) {

            if (textByChar[i] == 'P' && textByChar[i + 1] == 'A'
                    && !CharLogics.isPunctuationMark(textByChar[i + 2]) && i + 2 != text.length() - 1) {
                textByChar[i + 1] = 'O';
            }
        }

        return new String(textByChar);
    }

    public String correctLetterUsingRegex(String text) throws EmptyStringException {
        if (text == null) throw new EmptyStringException("String is empty");

        String resultedText = text.replaceAll("PA(\\w)", "PO$1");
        return resultedText.replaceAll("PA(\\w)", "PO$1");
    }
}
