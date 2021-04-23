package by.epamtc.task4.logic;

import by.epamtc.exeptions.EmptyStringException;
import by.epamtc.util.CharArrayLogics;
import by.epamtc.util.CharLogics;

public class DeleteLogics {
    public String deleteNonLettersUsingString(String text) throws EmptyStringException {
        if (text == null) throw new EmptyStringException("String is empty");

        int i = 0;
        while (i < text.length()) {
            boolean isLetter = CharLogics.isLetter(text.charAt(i));

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

    public String deleteNonLettersUsingChars(String text) throws EmptyStringException {
        if (text == null) throw new EmptyStringException("String is empty");

        char[] textByChar = text.toCharArray();
        int i = 0;
        while (i < textByChar.length) {
            boolean isLetter = CharLogics.isLetter(textByChar[i]);

            if (!isLetter && textByChar[i] != ' ') {
                int begin = 0;
                int end = i - 1;
                char[] leftSubstring = CharArrayLogics.subarray(textByChar, begin, end);
                char[] rightSubstring = {};
                if (i + 1 < textByChar.length) {
                    begin = i + 1;
                    end = textByChar.length - 1;
                    rightSubstring = CharArrayLogics.subarray(textByChar, begin, end);
                }
                textByChar = CharArrayLogics.concatenate(leftSubstring, rightSubstring);
                i--;
            }
            i++;
        }
        return new String(textByChar);
    }

    public String deleteNonLettersUsingRegex(String text) throws EmptyStringException {
        if (text == null) throw new EmptyStringException("String is empty");

        return text.replaceAll("([^А-Яа-яA-Za-z ])", "");
    }
}
