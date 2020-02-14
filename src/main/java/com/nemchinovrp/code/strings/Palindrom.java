package com.nemchinovrp.code.strings;

public class Palindrom {

    public static boolean isPalindromic(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, --j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}