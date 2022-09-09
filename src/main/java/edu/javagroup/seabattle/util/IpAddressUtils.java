package edu.javagroup.seabattle.util;

import lombok.SneakyThrows;

import java.net.InetAddress;
import java.util.Arrays;

public class IpAddressUtils {

    private static final int[] LOCALHOST = {127, 0, 0, 1};

    public static boolean isIpAddress(String ipAddress) {
        if (StringUtils.isEmpty(ipAddress)) {
            return false;
        }
        String[] parts = ipAddress.split("\\.");
        if (parts.length != 4) {
            return false;
        }
        int[] partsArrayCheckOnLocalhost = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            if (!NumberUtils.isNumber(parts[i])) {
                return false;
            }
            partsArrayCheckOnLocalhost[i] = Integer.parseInt(parts[i]);
        }
        if (Arrays.equals(partsArrayCheckOnLocalhost, LOCALHOST)) {
            return false;
        }
        for (int i = 0; i < parts.length; i++) {
            if (!elementCheck(parts[i], i == 0)) {
                return false;
            }
        }
        return !ipAddress.endsWith(".");
    }

    private static boolean elementCheck(String element, boolean isFirstElement) {
        int intElement = Integer.parseInt(element);
        return isFirstElement ? intElement >= 1 && intElement <= 255 : intElement >= 0 && intElement <= 255;
    }

}
