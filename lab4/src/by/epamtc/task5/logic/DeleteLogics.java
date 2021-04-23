package by.epamtc.task5.logic;

import by.epamtc.exeptions.EmptyStringException;
import by.epamtc.util.CharArrayLogics;
import by.epamtc.util.CharLogics;

public class DeleteLogics {
    public String deleteConsonantWordsUsingString(String text, int length) throws EmptyStringException {
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
            if (wordLength == length && CharLogics.isConsonant(text.charAt(i - 1))) {
                String left = text.substring(0, i - 1);
                String right = text.substring(i - 1 + length);
                text = left + right;

            } else i += wordLength;
        }

        return text;
    }

    public String deleteConsonantWordsUsingChars(String text, int length) throws EmptyStringException {
        if (text == null) throw new EmptyStringException("String is empty");

        char[] textByChar = text.toCharArray();

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
            if (wordLength == length && CharLogics.isConsonant(textByChar[i - 1])) {
                char[] leftSubstring = CharArrayLogics.subarray(textByChar, 0, i - 2);
                char[] rightSubstring = CharArrayLogics.subarray(textByChar,i - 1 + length, textByChar.length - 1);
                textByChar = CharArrayLogics.concatenate(leftSubstring, rightSubstring);
            } else i += wordLength;
        }

        return new String(textByChar);
    }

    public String deleteConsonantWordsUsingRegex(String text, int length) throws EmptyStringException {
        if (text == null) throw new EmptyStringException("String is empty");

        String[] words = text.split("\\b");
        StringBuilder result = new StringBuilder();
        String pattern = "[B-DF-HJ-NP-TV-Zb-df-hj-np-tv-z]\\w{" + (length - 1) + "}";

        for (String word : words) {
            if (!word.matches(pattern)) {
                result.append(word);
            }
        }

        return result.toString();
    }
}
