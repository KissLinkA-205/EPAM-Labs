package by.epamtc.jwd.util;

public class CharArrayUtil {
    public static char[] subarray(char[] source, int begin, int end) {
        char[] result = new char[end - begin + 1];
        if (result.length >= 0) {
            int destPos = 0;
            System.arraycopy(source, begin, result, destPos, result.length);
        }

        return result;
    }

    public static char[] concatenate(char[] substringLeft, char[] substringRight) {
        int length = substringLeft.length + substringRight.length;
        char[] result = new char[length];

        int srcPos = 0;
        int destPos = 0;
        System.arraycopy(substringLeft, srcPos, result, destPos, substringLeft.length);
        System.arraycopy(substringRight, srcPos, result, substringLeft.length, substringRight.length);

        return result;
    }
}
