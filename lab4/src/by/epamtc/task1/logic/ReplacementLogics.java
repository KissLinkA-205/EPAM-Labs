package by.epamtc.task1.logic;

import by.epamtc.exeptions.EmptyStringException;
import by.epamtc.util.CharLogics;

public class ReplacementLogics {
    public String replaceLetterUsingString(String text, int numberOfLetter, char letter) throws EmptyStringException {
        if (text == null) throw new EmptyStringException("String is empty");

        int i = 0;
        while (i < text.length()) {
            int wordLength = 0;
            for (int j = i; j < text.length(); j++) {
                char currentLetter = text.charAt(j);
                if (CharLogics.isPunctuationMark(currentLetter) || j == text.length() - 1) {
                    i++;
                    break;
                }
                wordLength++;
            }
            if (wordLength >= numberOfLetter) {
                text = text.substring(0, i + numberOfLetter - 2) + letter + text.substring(i + numberOfLetter - 1);
            }
            i += wordLength;
        }
        return text;
    }

    public String replaceLetterUsingChars(String text, int numberOfLetter, char letter) throws EmptyStringException {
        if (text == null) throw new EmptyStringException("String is empty");

        char[] textByChar = text.toCharArray();

        int i = 0;
        while (i < textByChar.length) {
            int wordLength = 0;
            for (int j = i; j < textByChar.length; j++) {
                if (CharLogics.isPunctuationMark(textByChar[j]) || j == textByChar.length - 1) {
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

    public String replaceLetterUsingRegex(String text, int numberOfLetter, char letter) throws EmptyStringException {
        if (text == null) throw new EmptyStringException("String is empty");

        String[] words = text.split("\\b");
        StringBuilder result = new StringBuilder();

        for (String s : words) {
            String word = " ";
            if (word.matches("\\w+") && word.length() >= numberOfLetter) {
                word = word.substring(0, numberOfLetter - 1) + letter + word.substring(numberOfLetter);
            }
            result.append(word);
        }
        return result.toString();
    }
}
