package by.epamtc.task3.logic;

import by.epamtc.exeptions.EmptyStringException;
import by.epamtc.util.CharArrayLogics;
import by.epamtc.util.CharLogics;

public class ReplacementLogics {
    public String replaceWordsUsingString(String text, int length, String substring) throws EmptyStringException {
        if (text == null) throw new EmptyStringException("String is empty");

        int i = 0;
        while (i < text.length()) {
            int wordLength = 0;
            for (int j = i; j < text.length(); j++) {
                char currentLetter = text.charAt(j);
                if (CharLogics.isPunctuationMark(currentLetter)) {
                    i++;
                    break;
                }
                if (j == text.length() - 1) i++;
                wordLength++;
            }
            if (wordLength == length) {
                String left = text.substring(0, i - 1);
                String right = text.substring(i - 1 + length);
                text = left + substring + right;
            }
            i += wordLength;
        }

        return text;
    }

    public String replaceWordsUsingChars(String text, int length, String substring) throws EmptyStringException {
        if (text == null) throw new EmptyStringException("String is empty");

        char[] textByChar = text.toCharArray();
        char[] substringByChars = substring.toCharArray();

        int i = 0;
        while (i < textByChar.length) {
            int wordLength = 0;
            for (int j = i; j < textByChar.length; j++) {
                char currentLetter = textByChar[j];
                if (CharLogics.isPunctuationMark(currentLetter)) {
                    i++;
                    break;
                }
                if (j == textByChar.length - 1) i++;
                wordLength++;
            }
            if (wordLength == length) {
                char[] leftSubstring = CharArrayLogics.subarray(textByChar, 0, i - 2);
                char[] rightSubstring = CharArrayLogics.subarray(textByChar,i - 1 + length, textByChar.length - 1);
                textByChar = CharArrayLogics.concatenate(leftSubstring, substringByChars);
                textByChar = CharArrayLogics.concatenate(textByChar, rightSubstring);
            }
            i += wordLength;
        }

        return new String(textByChar);
    }

    public String replaceWordsUsingRegex(String text, int length, String substring) throws EmptyStringException {
        if (text == null) throw new EmptyStringException("String is empty");

        String[] words = text.split("\\b");
        StringBuilder result = new StringBuilder();
        String pattern = "\\w{" + length + "}";

        for (String s : words) {
            String word = s;
            if (word.matches(pattern)) {
                word = substring;
            }
            result.append(word);
        }
        return result.toString();
    }
}