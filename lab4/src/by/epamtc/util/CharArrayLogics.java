package by.epamtc.util;

public class CharArrayLogics {
    public static char[] subarray(char[] source, int begin, int end) {
        char[] result = new char[end - begin + 1];
        if (result.length >= 0) System.arraycopy(source, begin, result, 0, result.length);

        return result;
    }

    public static char[] concatenate(char[] substringLeft, char[] substringRight) {
        int length = substringLeft.length + substringRight.length;
        char[] result = new char[length];

        System.arraycopy(substringLeft, 0, result, 0, substringLeft.length);
        System.arraycopy(substringRight, 0, result, substringLeft.length, substringRight.length);

        return result;
    }
}
