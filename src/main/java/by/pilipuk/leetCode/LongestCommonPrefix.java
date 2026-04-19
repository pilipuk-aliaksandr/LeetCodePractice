package by.pilipuk.leetCode;

import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        var prefix = Arrays.stream(strs)
                .min(Comparator.comparingInt(String::length)).orElse("");
        if (prefix.isEmpty()) {
            return "";
        } else {
            for (String str : strs) {
                while (!str.startsWith(prefix)) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                    if (prefix.isEmpty()) {
                        return "";
                    }
                }
            }
        }
        return prefix;
    }
}