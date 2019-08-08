package cn.ice.lab.utils;

import java.util.UUID;

public class UtilityTools {

    public static String generateUUID() {
        return UUID.randomUUID().toString().replace("-", "").toUpperCase();
    }
}
