package ru.marat.javacore.utils;

import java.util.TreeMap;
public class TextUtils {
    public static TreeMap<Character, Integer> gettingMap(String message) {
        TreeMap<Character, Integer> map = new TreeMap();
        char[] arrayChars = message.toCharArray();

        for(char ch : arrayChars){
            map.computeIfPresent(ch, (key, value) -> value + 1);
            map.putIfAbsent(ch, 1);
        }

        return map;
    }
}
