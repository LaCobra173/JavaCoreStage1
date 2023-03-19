package ru.marat.javacore.utils;

import java.util.TreeMap;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;

public class TextUtils {
    public static TreeMap<Character, Integer> gettingMap(String message) {
        char[] arrayChars = message.toCharArray();
        return IntStream.range(0, arrayChars.length)
                .mapToObj(i -> arrayChars[i])
                .collect(groupingBy(key -> key, TreeMap::new, summingInt(ch -> 1)));
    }
}