package pers.asa.springuploadparent.util;

/**
 * @version 1.0.0
 * @author: rongbin.xie
 * @date: 2020/3/17
 * @CopyRight: COPYRIGHT © 2001 - 2019 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class SupUtils {
    private static String OS = System.getProperty("os.name").toLowerCase();

    public static boolean isWindows() {

        return (OS.contains("win"));

    }

    public static boolean isMac() {

        return (OS.contains("mac"));

    }

    public static boolean isUnix() {

        return (OS.contains("nix") || OS.contains("nux") || OS.indexOf("aix") > 0);

    }

    public static boolean isSolaris() {

        return (OS.contains("sunos"));

    }
}
