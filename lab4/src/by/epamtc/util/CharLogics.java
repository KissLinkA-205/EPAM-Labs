package by.epamtc.util;

public class CharLogics {
    static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static final String CONSONANTS = "BCDFGJKLMNPQSTVXZHRWYbcdfgjklmnpqstvxzhrwy";
    static final String PUNCTUATION = " .,?!;:(){}[]";

    public static boolean isPunctuationMark(char letter) {
        boolean result = false;
        for (int j = 0; j < PUNCTUATION.length(); j++) {
            if (letter == PUNCTUATION.charAt(j)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean isLetter(char letter) {
        boolean result = false;
        for (int j = 0; j < ALPHABET.length(); j++) {
            if (letter == ALPHABET.charAt(j)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean isConsonant(char letter) {
        boolean result = false;
        for (int j = 0; j < CONSONANTS.length(); j++) {
            if (letter == CONSONANTS.charAt(j)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
