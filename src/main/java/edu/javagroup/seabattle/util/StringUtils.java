package edu.javagroup.seabattle.util;

public class StringUtils {

    public static boolean isEmpty(CharSequence stringValidation) {
        return stringValidation == null || stringValidation.length() == 0;
    }

    public static boolean isNotEmpty(CharSequence notEmpty) {
        return !isEmpty(notEmpty);
    }

    public static char letterBefore(char letter) {
        return (char) (letter - 1);
    }

    public static char letterAfter(char letter) {
        return (char) (letter + 1);
    }
}
