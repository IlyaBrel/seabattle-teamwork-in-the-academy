package edu.javagroup.seabattle.util;

public class NumberUtils {

    public static boolean isNumber(String checksIntegerValue) {
        if (StringUtils.isEmpty(checksIntegerValue)) {
            return false;
        }
        for (int i = 0; i < checksIntegerValue.length(); i++) {
            if (!Character.isDigit(checksIntegerValue.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static String currentNumber(int col) {
        return col < 10 ? "0" + col : "" + col;
    }

    public static String numberBefore(int col) {
        return col < 10 ? "0" + (col - 1) : "" + (col - 1);
    }

    public static String numberAfter(int col) {
        return col < 10 ? "0" + (col + 1) : "" + (col + 1);
    }
}
