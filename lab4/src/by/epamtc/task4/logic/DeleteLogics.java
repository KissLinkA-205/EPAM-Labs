package by.epamtc.task4.logic;

import by.epamtc.exeptions.EmptyStringException;
import by.epamtc.util.CharArrayLogics;
import by.epamtc.util.CharLogics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DeleteLogics {
    public String deleteNonLettersUsingString(String text) throws EmptyStringException {
        if (text == null) throw new EmptyStringException("String is empty");

        int i = 0;
        while (i < text.length()) {
            boolean isLetter = CharLogics.isLetter(text.charAt(i));

            if (!isLetter && text.charAt(i) != ' ') {
                String workingText = text.substring(0, i);
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
                char[] leftSubstring = CharArrayLogics.subarray(textByChar, 0, i - 1);
                char[] rightSubstring = {};
                if (i + 1 < textByChar.length) {
                    rightSubstring = CharArrayLogics.subarray(textByChar, i + 1, textByChar.length - 1);
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
